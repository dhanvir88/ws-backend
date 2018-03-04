package com.ws.application.temp;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.apache.commons.beanutils.BeanUtils;

import com.ws.applcation.handle.dataProvider;

public class temp90 {
	private static BeanUtils factory = null;
	private static Object lock = new Object();
	private static Class obj = null;

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Map<String, Object> mapforinstance = new HashMap<>();
		Map<String, String> map = new HashMap<>();
		Map<String, Class> map2 = new HashMap<>();
		BeanUtils utils = new BeanUtils();
		String[] capturingNameAndType = null;
		String capturingName = null;
		String capturingType = null;
		Class<?> MLI = null;
		Object instn = null;
		ArrayList<String> liststrings = new ArrayList<>(Arrays
			.asList("com.classes.xjc.tpspagw32xsd.TPSPPaymentReq&&TPSPPaymentReq", "com.classes.xjc.tpspagw32xsd.Paymentinfo&&paymentinfo", "int&&paymenttypecode", "com.classes.xjc.tpspagw32xsd.Moneyinformation&&moneyinformation", "java.math.BigInteger&&units", "java.lang.String&&quantity", "long&&msisdn"));
		ArrayList<String> list = new ArrayList<>();
		if (!liststrings.isEmpty()) {
			for (String comp : liststrings) {
				capturingNameAndType = comp.split("&&");
				capturingName = capturingNameAndType[1];
				capturingType = capturingNameAndType[0];
				if (capturingType.contains("com.classes.xjc")) {
					MLI = Class.forName(capturingType);
					instn = MLI.newInstance();
					map2.put(capturingType, MLI);
					mapforinstance.put(capturingType, instn);
					map.put(capturingName, capturingType);
					list.add(capturingType);
				}
				if (!capturingType.contains("com.classes.xjc")) {
					if (!list.isEmpty()) {
						for (String checkingFieldmatch : list) {
							ArrayList<String> list23 = dataProvider.classFieldslister(checkingFieldmatch);
							if (!list23.isEmpty()) {
								for (String matchingCase : list23) {
									if (matchingCase.equals(capturingName)) {
										int asd = 2414144;
										/*
										 * here we can add a logic for data
										 * Types in order to validate String
										 * number
										 *
										 *
										 */
										Object value = mapforinstance.get(checkingFieldmatch);
										utils.setProperty(value, capturingName, asd);

										System.out.println("ParentInstance: " + value + " capturingName: " + capturingName + "Value or other" + asd);
									}
								}
							}
						}

					}

				}
			}
		}
		if (mapforinstance != null && !list.isEmpty()) {
			Object value1 = null;
			for (String checkingFieldmatch : list) {
				ArrayList<String> list233 = dataProvider.classFieldslister(checkingFieldmatch);
				for (String matchingCase : list233) {
					if (!list233.isEmpty()) {
						if (!map.isEmpty() && list.contains(map.get(matchingCase))) {
							value1 = mapforinstance.get(map.get(matchingCase));
							System.out.println("sdeParentInstance: " + mapforinstance.get(checkingFieldmatch) + " capturingName: " + matchingCase + "Value or other" + value1);
							BeanUtils.setProperty(mapforinstance.get(checkingFieldmatch), matchingCase, value1);
						}
					}
				}

			}
		}

		try {
			QName qName = new QName("ns2" + ":" + "TPSPPaymentReq");
			JAXBContext jaxbContext = JAXBContext.newInstance(map2.get("com.classes.xjc.tpspagw32xsd.TPSPPaymentReq"));
			System.out.println("Print MLI " + MLI);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			JAXBElement<Object> root = new JAXBElement<>(qName, map2.get("com.classes.xjc.tpspagw32xsd.TPSPPaymentReq"), mapforinstance.get("com.classes.xjc.tpspagw32xsd.TPSPPaymentReq"));

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(root, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	public static BeanUtils getInstance() {
		if (null != factory) {
			return factory;
		} else {
			synchronized (lock) {
				if (null != factory) {
					return factory;
				} else {
					factory = new BeanUtils();
					return factory;
				}
			}
		}
	}

}