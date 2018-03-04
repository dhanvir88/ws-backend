package com.ws.application.temp;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.apache.commons.beanutils.BeanUtils;

import com.ws.applcation.handle.dataProvider;

public class temp10 {

	public static String processListedClass = null;

	public static String getProcessListedClass() {
		return processListedClass;
	}

	public static void setProcessListedClass(String processListedClass) {
		temp10.processListedClass = processListedClass;
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, MalformedURLException, ReflectiveOperationException, JAXBException, SOAPException, FileNotFoundException {
		StringBuilder stringBuilder = new StringBuilder();
		ArrayList<String> liststrings = new ArrayList<>(Arrays
			.asList("com.classes.xjc.tpspagw32xsd.Servicebalanceinfo&&servicebalanceinfo", "com.classes.xjc.tpspagw32xsd.Balanceinfo&&balanceinfo", "java.lang.String&&servicetype", "java.lang.String&&unitsdescription", "java.math.BigInteger&&units", "java.lang.String&&quantity", "com.classes.xjc.tpspagw32xsd.Featurebalanceinfo&&featurebalanceinfo", "com.classes.xjc.tpspagw32xsd.Balanceinfo&&balanceinfo", "java.lang.String&&servicetype", "java.lang.String&&unitsdescription", "java.math.BigInteger&&units", "java.lang.String&&quantity"));
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

						ListIterator<String> itr = listnoncomobjects.listIterator();
						// Iterator<String> itr = listnoncomobjects.iterator();
						// for (String checkingFieldmatch : listnoncomobjects) {
						while (itr.hasNext()) {
							String checkingFieldmatch = itr.next();
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
										System.out.println("Element Name: " + matchingCase + "-Object " + value);
										stringBuilder.append(matchingCase);

										StringBuilder b = new StringBuilder();
										for (String s : fieldlister) {
											b.append(s);
										}

										String checkSizeoffields = checkingFieldmatch + stringBuilder.toString();
										if (checkSizeoffields.length() == String.valueOf(checkingFieldmatch + b.toString()).length()) {
											itr.remove();
											stringBuilder.setLength(0);

										}

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
			System.out.println("listcomobjects Name: " + listnoncomobjects);
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
	}

}
