package com.ws.application.temp;

import java.lang.reflect.Field;

public class temp2 {

	public static void main(String[] args) throws Exception {

		String pathclass = "com.classes.xjc.tpspagw32xsd.Paymentinfo";
		// com.ws.application.gui.itemContentFactoryImpl impl = new
		// com.ws.application.gui.itemContentFactoryImpl();
		// Field[] declared = impl.callElementIterate(pathclass);
		// System.out.println(declared);

		Class<?> c = Class.forName(pathclass);
		c.newInstance();
		Field fields[] = c.getDeclaredFields();

		System.out.println(fields + "Access all the fields");

		for (Field field : fields) {

			System.out.println("Field Name: " + field.getName());

		}
	}

}
