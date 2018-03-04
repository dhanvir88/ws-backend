package com.ws.applcation.handle;

import java.io.ByteArrayOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.beanutils.BeanUtils;

import com.ws.application.beans.createTestStructureStepBean;
import com.ws.application.beans.itemSelectionBean;
import com.ws.application.common.wsConstants;

public class requesthandler {
	private ArrayList<String> subRequestElementsEnum;
	createTestStructureStepBean createteststructure = new createTestStructureStepBean();
	Field[] requestElements;
	Field[] innerRequestElements;
	itemSelectionBean itemselection = new itemSelectionBean();
	dataProvider provider = new dataProvider();
	private XmlElement xmlelement;
	public static String PPS_AGW_NAME_SPACE = null;

	public void requesthandlerimpl() {

		subRequestElementsEnum = new ArrayList<>();
		Stack<String> addingComStructures = new Stack<>();
		ArrayList<String> listOfElements = new ArrayList<>();
		String parseCom = null;
		try {
			if (itemSelectionBean.requestCallSelectionOnRun.getValue() != null) {

				System.out.println(" ********** " + itemSelectionBean.requestCallSelectionOnRun.getValue() + " ********** ");
				createteststructure.setXsdSelection(itemSelectionBean.xsdSelectionOnRun.getValue());
				createteststructure.setRequestCallSelection(itemSelectionBean.requestCallSelectionOnRun.getValue());
				requestElements = provider.callElements(itemSelectionBean.xsdSelectionOnRun.getValue(), itemSelectionBean.requestCallSelectionOnRun.getValue());
				addingComStructures.push("Intialize");
				while (!addingComStructures.isEmpty() || requestElements != null) {

					if (addingComStructures.search("Intialize") == 1) {
						addingComStructures.pop();
					}
					if (requestElements != null) {
						for (Field field : requestElements) {
							field.setAccessible(true);
							xmlelement = field.getAnnotation(XmlElement.class);
							Type type = field.getGenericType();
							if (xmlelement == null || xmlelement.name().contains("default")) {
								itemSelectionBean.setFieldNameOnRun(field.getName());
								System.out.println("1 - " + itemSelectionBean.getFieldNameOnRun());

							} else {
								itemSelectionBean.setFieldNameOnRun(xmlelement.name());
								System.out.println("2 -  " + itemSelectionBean.getFieldNameOnRun());
							}

							if (type instanceof ParameterizedType) {
								ParameterizedType parameterType = (ParameterizedType) type;
								for (Type fieldInnerType : parameterType.getActualTypeArguments()) {

									itemSelectionBean.setFieldTypeOnRun(fieldInnerType.getTypeName());
									addingComStructures.push(itemSelectionBean.getFieldTypeOnRun() + wsConstants.xsdPackageLocations.NAME_TYPE_SEPERATOR + itemSelectionBean.getFieldNameOnRun());
									System.out.println("3 -  " + itemSelectionBean.getFieldNameOnRun());
								}
							}
							if (!(type instanceof ParameterizedType)) {

								itemSelectionBean.setFieldTypeOnRun(field.getType().getName());
								addingComStructures.push(itemSelectionBean.getFieldTypeOnRun() + wsConstants.xsdPackageLocations.NAME_TYPE_SEPERATOR + itemSelectionBean.getFieldNameOnRun());

							}
						}
					}
					requestElements = null;
					// System.out.println("Stack " + addingComStructures);
					parseCom = addingComStructures.pop();
					String[] capturingNameAndType = parseCom.split(wsConstants.xsdPackageLocations.NAME_TYPE_SEPERATOR);
					String capturingName = capturingNameAndType[1];
					String capturingType = capturingNameAndType[0];
					if (capturingType.contains(itemSelectionBean.xsdSelectionOnRun.getValue()) && parseCom.contains(wsConstants.xsdPackageLocations.NAME_TYPE_SEPERATOR)) {

						if (isClassEnum(capturingType)) {
							subRequestElementsEnum = provider.callElementReturnTypeEnum(capturingType);
							System.out.println("subRequestElementsEnum2:-" + subRequestElementsEnum);
							listOfElements.add(subRequestElementsEnum.toString());
						} else {
							requestElements = callElementIterate(capturingType);

							// here we can add the soap method tag.
						}
						listOfElements.add(capturingType + "&&" + capturingName);
					} else {

						listOfElements.add(capturingType + "&&" + capturingName);
					}
					parseCom = null;

				}

				dataBinding.getInstance();
				String addingrootelemnent = "com.classes.xjc." + itemSelectionBean.xsdSelectionOnRun.getValue() + "." + itemSelectionBean.requestCallSelectionOnRun.getValue() + "&&" + itemSelectionBean.requestCallSelectionOnRun.getValue();
				// System.out.println(listOfElements);
				listOfElements.add(0, addingrootelemnent);

				soapStructureImpl(listOfElements);
			}
		} catch (Exception e1) {

			e1.printStackTrace();
		}

	}

	public void soapStructureImpl(ArrayList<String> liststrings) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, SOAPException {

		Map<String, Object> mappingclasstype = new HashMap<>();
		Map<String, String> mappingtypeandname = new HashMap<>();
		Map<String, Class> mappingclassname = new HashMap<>();
		String[] capturingNameAndType = null;
		String capturingName = null;
		String capturingType = null;
		Class<?> classinstance = null;
		Object objectinstance = null;
		ArrayList<String> listcomobjects = new ArrayList<>();
		ArrayList<String> listnoncomobjects = new ArrayList<>();
		if (!liststrings.isEmpty()) {
			for (String splitclassname : liststrings) {
				capturingNameAndType = splitclassname.split("&&");
				capturingName = capturingNameAndType[1];
				capturingType = capturingNameAndType[0];
				if (capturingType.contains("com.classes.xjc")) {
					classinstance = Class.forName(capturingType);
					objectinstance = classinstance.newInstance();
					mappingclassname.put(capturingType, classinstance);
					mappingclasstype.put(capturingType, objectinstance);
					mappingtypeandname.put(capturingName, capturingType);
					listcomobjects.add(capturingType);
					listnoncomobjects.add(capturingType);
				}
				if (!capturingType.contains("com.classes.xjc")) {
					if (!listnoncomobjects.isEmpty()) {
						for (String checkingFieldmatch : listnoncomobjects) {
							ArrayList<String> fieldlister = dataProvider.classFieldslister(checkingFieldmatch);
							if (!fieldlister.isEmpty()) {
								for (String matchingCase : fieldlister) {
									if (matchingCase.equals(capturingName)) {
										int asd = 2414144;
										/*
										 * here we can add a logic for data
										 * Types in order to validate String
										 * number
										 *
										 *
										 */
										Object value = mappingclasstype.get(checkingFieldmatch);
										BeanUtils.setProperty(value, capturingName, asd);
										System.out.println("Element Name: " + capturingName);
										// System.out.println("ParentInstance: "
										// + value + " capturingName: " +
										// capturingName + "Value or other" +
										// asd);
									}
								}
							}
						}

					}

				}
			}
		}
		if (mappingclasstype != null && !listcomobjects.isEmpty()) {
			Object value1 = null;
			for (String checkingFieldmatch : listcomobjects) {
				ArrayList<String> fieldlisterforobjectmap = dataProvider.classFieldslister(checkingFieldmatch);
				for (String matchingCase : fieldlisterforobjectmap) {
					if (!fieldlisterforobjectmap.isEmpty()) {
						if (!mappingtypeandname.isEmpty() && listcomobjects.contains(mappingtypeandname.get(matchingCase))) {
							value1 = mappingclasstype.get(mappingtypeandname.get(matchingCase));
							System.out.println("sdeParentInstance: " + mappingclasstype.get(checkingFieldmatch) + " capturingName: " + matchingCase + "Value or other" + value1);
							BeanUtils.setProperty(mappingclasstype.get(checkingFieldmatch), matchingCase, value1);
						}
					}
				}

			}
		}

		try {

			QName qName = new QName("ns2" + ":" + itemSelectionBean.requestCallSelectionOnRun.getValue());
			JAXBContext jaxbContext = JAXBContext.newInstance(mappingclassname.get("com.classes.xjc." + itemSelectionBean.xsdSelectionOnRun.getValue() + "." + itemSelectionBean.requestCallSelectionOnRun.getValue()));
			System.out.println("Print MLI " + classinstance);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			JAXBElement<Object> root = new JAXBElement<>(qName, mappingclassname.get("com.classes.xjc." + itemSelectionBean.xsdSelectionOnRun.getValue() + "." + itemSelectionBean.requestCallSelectionOnRun.getValue()),
				mappingclasstype.get("com.classes.xjc." + itemSelectionBean.xsdSelectionOnRun.getValue() + "." + itemSelectionBean.requestCallSelectionOnRun.getValue()));
			fetnamesapce(root);
			MessageFactory mf = MessageFactory.newInstance();
			SOAPMessage message = mf.createMessage();
			SOAPPart part = message.getSOAPPart();
			SOAPEnvelope envelope = part.getEnvelope();
			envelope.addNamespaceDeclaration("ns2", PPS_AGW_NAME_SPACE);
			SOAPHeader header = envelope.getHeader();
			SOAPBody body = message.getSOAPBody();
			// output pretty printed
			jaxbMarshaller.marshal(root, body);
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			message.saveChanges();
			// message.writeTo(System.out);
			itemSelectionBean.setRequestProcessingCall(getSOAPMessageAsString(message));
			System.out.println(getSOAPMessageAsString(message));
			// jaxbMarshaller.marshal(customer, file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	public static String getSOAPMessageAsString(SOAPMessage soapMessage) {
		try {

			TransformerFactory tff = TransformerFactory.newInstance();
			Transformer tf = tff.newTransformer();

			// Set formatting

			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			Source sc = soapMessage.getSOAPPart().getContent();

			ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
			StreamResult result = new StreamResult(streamOut);
			tf.transform(sc, result);

			String strMessage = streamOut.toString();
			return strMessage;
		} catch (Exception e) {
			System.out.println("Exception in getSOAPMessageAsString " + e.getMessage());
			return null;
		}

	}

	public static void fetnamesapce(JAXBElement<Object> e) {

		for (Annotation annotation : e.getValue().getClass().getPackage().getAnnotations()) {

			if (annotation.annotationType().getSimpleName().equals("XmlSchema")) {
				Package namespace = e.getValue().getClass().getPackage();
				String namespace1 = namespace.getAnnotation(javax.xml.bind.annotation.XmlSchema.class).namespace();

				System.out.println("this " + namespace1);
				PPS_AGW_NAME_SPACE = namespace1;

			}
		}
	}

	public Field[] callElementIterate(String classpath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> c = Class.forName(classpath);
		c.newInstance();
		Field fields[] = c.getDeclaredFields();
		return fields;
	}

	public boolean isClassEnum(String className) {
		try {
			Class<?> enumClass = Class.forName(className);
			if (enumClass.isEnum()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			return false;
		}
		return false;
	}
}
