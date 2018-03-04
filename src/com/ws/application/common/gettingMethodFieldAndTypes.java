package com.ws.application.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class gettingMethodFieldAndTypes {

	public static void main(String... args) throws MalformedURLException {
		try {
			// List<Enum> enumValues = new
			// ArrayList<Enum>(EnumSet.allOf(Enum.class));
			Class<?> c = Class.forName("com.classes.xjc.tpspagw32xsd.Paymentinfo");
			// Class<?> c = Class.forName("Mode");
			Object[] objects = c.getEnumConstants();
			// now this is not what I want, but almost
			// for (Object obj : objects) {
			// System.out.println("value : " + obj);
			// }
			c.newInstance();

			// Print all the method names & execution result

			Method methods[] = c.getDeclaredMethods();

			// System.out.println("Access all the methods");

			for (Method method : methods) {
				if (method.getName().startsWith("get") && method.getParameterTypes().length == 0) {
					System.out.println("Method Name: " + method.getName());

					System.out.println("Return type: " + method.getReturnType());

					method.setAccessible(true);

				}
			}

			// Print all the field names & values

			Field fields[] = c.getDeclaredFields();

			System.out.println(fields + "Access all the fields");

			for (Field field : fields) {

				System.out.println("Field Name: " + field.getName());

			}

			// production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (InstantiationException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}
