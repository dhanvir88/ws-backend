package com.ws.application.temp;

import java.io.ByteArrayOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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

import com.ws.application.common.wsConstants;

public class temp {
	private static final Object[] EMPTY = {};
	private static final String String = null;
	public static String PPS_AGW_NAME_SPACE = null;
	public static String PPS_AGW_NAME_SPACE_PREFIX = "ppsagw";
	public static String headingTab = null;

	public static String getHeadingTab() {
		return headingTab;
	}

	public static void setHeadingTab(String headingTab) {
		temp.headingTab = headingTab;
	}

	public static void main(String... args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, MalformedURLException, ReflectiveOperationException, JAXBException, SOAPException {
		String headers = "com.classes.xjc.tpspagw32xsd.TPSPGetAccountsResp";
		ArrayList<String> liststrings = new ArrayList<>(Arrays.asList("com.classes.xjc.tpspagw32xsd.Multilineinfo&&multilineinfo", "com.classes.xjc.tpspagw32xsd.Members&&members"));
		temp t1 = new temp();
		t1.builder(liststrings);
	}

	public void builder(ArrayList<String> liststrings) throws NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, MalformedURLException, ReflectiveOperationException, JAXBException, SOAPException {

		Class c = null;
		Object instn = null;
		// while (!liststrings.isEmpty()) {
		List<String> books = new ArrayList<>();
		for (String copy : liststrings) {
			String capturingCom = null;
			String capturingPart = null;
			if (copy.contains("&&")) {
				String[] capturing = copy.split("&&");
				capturingCom = capturing[0];
				capturingPart = capturing[1];
				// setHeadingTab(capturingPart);
				System.out.println(capturingCom);
			} else {
			}
			books.add(capturingCom);
			books.add(capturingCom);
			c = Class.forName(capturingCom);
			instn = c.newInstance();
			BeanUtils.setProperty(instn, copy, "100");
		}
		JAXBContext jaxbContext = JAXBContext.newInstance(c);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		JAXBElement<Object> e = new JAXBElement<>(new QName(wsConstants.SoapHeaderConstants.PPS_AGW_NAME_SPACE_PREFIX + ":" + books), c, instn);

		fetnamesapce(e);
		MessageFactory mf = MessageFactory.newInstance();
		SOAPMessage message = mf.createMessage();
		SOAPPart part = message.getSOAPPart();
		SOAPEnvelope envelope = part.getEnvelope();
		envelope.addNamespaceDeclaration(PPS_AGW_NAME_SPACE_PREFIX, PPS_AGW_NAME_SPACE);
		System.out.println(envelope.getPrefix());

		SOAPHeader header = envelope.getHeader();
		SOAPBody body = message.getSOAPBody();
		jaxbMarshaller.marshal(e, body);

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// jaxbMarshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper",
		// new MyNamespaceMapper(contentHandler.getNamespaces()));

		message.saveChanges();
		// message.writeTo(System.out);
		System.out.println(getSOAPMessageAsString(message));
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
}