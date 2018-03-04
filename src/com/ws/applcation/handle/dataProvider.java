package com.ws.applcation.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.xml.xsom.XSElementDecl;
import com.sun.xml.xsom.XSSchema;
import com.sun.xml.xsom.XSSchemaSet;
import com.sun.xml.xsom.XSType;
import com.sun.xml.xsom.parser.XSOMParser;
import com.ws.application.beans.itemSelectionBean;

public class dataProvider {

	private ArrayList<String> xsdComplexElemnts = new ArrayList<>();

	public String[] listXSDFilesParsed() {

		File file = new File("src/com/classes/xjc/");
		String[] xsdFiles = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});

		return xsdFiles;
	}

	public List<String> listXSDComplexElements() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<String> elementListDisplayOnRun = new ArrayList<>();
		try {
			// parse the document
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File("F:/ATTPrepaid/F424/agw_4.1.xsd"));
			NodeList list = doc.getElementsByTagName("xsd:complexType");

			// loop to print data
			for (int i = 0; i < list.getLength(); i++) {
				Element first = (Element) list.item(i);
				if (first.hasAttributes()) {
					String complexElemnts = first.getAttribute("name");
					if (complexElemnts != null && itemSelectionBean.requestCallSelectionOnRun.getValue() != null) {
						// elementListDisplayOnRun =
						// callElements(itemSelectionBean.xsdSelectionOnRun.getValue(),
						// itemSelectionBean.requestCallSelectionOnRun.getValue());
						for (String originalCallElements : elementListDisplayOnRun) {
							String complexSubElemnts = first.getAttribute("type");
							// if(originalCallElements)
						}
						xsdComplexElemnts.add(complexElemnts);
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException ed) {
			ed.printStackTrace();
		}
		return xsdComplexElemnts;

	}

	@SuppressWarnings("deprecation")
	public ArrayList<String> listXSDComplexElementTypes() throws FileNotFoundException, UnsupportedEncodingException, SAXException {
		File file = new File("C:/Users/edhanvi/Dhanvir/ATTPrepaid/SoapUI/tpspagw_3.2.xsd");
		ArrayList<String> elementListDisplayOnRun = new ArrayList<>();
		if (file.exists()) {
			XSOMParser parser = new XSOMParser();
			InputStream inputStream = new FileInputStream(file);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");
			parser.parse(reader);
			XSSchemaSet xs = parser.getResult();
			XSSchema schema = xs.getSchema(1);
			Iterator<XSElementDecl> itr = schema.iterateElementDecls();
			while (itr.hasNext()) {

				XSElementDecl e = itr.next();
				XSType type = e.getType();

				if (type.isComplexType()) {

					if (!elementListDisplayOnRun.contains(type.getName())) {
						elementListDisplayOnRun.add(type.getName());

					} else if (!elementListDisplayOnRun.contains(e.getName())) {

						elementListDisplayOnRun.add(e.getName());
					}

				}

			}

		} else {
			System.out.println("File not founded");
		}

		return elementListDisplayOnRun;
	}

	public ArrayList<String> callElementReturnTypeProvider(String xsdname, String callname) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<String> elementReturnType = new ArrayList<>();
		Class<?> c = Class.forName("com.classes.xjc." + xsdname + "." + callname);
		c.newInstance();
		Method methods[] = c.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("get") && method.getParameterTypes().length == 0) {
				System.out.println("getdefaultvalue:- " + method.getReturnType());
				if (method != null) {

					method.setAccessible(true);

					elementReturnType.add(String.valueOf(method.getGenericReturnType().getTypeName()));
				}

			}
		}
		return elementReturnType;
	}

	public Field[] callElements(String xsdname, String classpath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<String> fieldList = new ArrayList<>();
		Class<?> c = Class.forName("com.classes.xjc." + xsdname + "." + classpath);
		c.newInstance();
		Field fields[] = c.getDeclaredFields();
		return fields;
	}

	public ArrayList<String> callElementReturnTypeEnum(String classpath) throws ClassNotFoundException {

		Class<?> c = Class.forName(classpath);
		Object[] objects = c.getEnumConstants();
		ArrayList<String> listEnum = new ArrayList<>();
		if (c.isEnum() && c != null) {
			for (Object obj : objects) {

				listEnum.add(String.valueOf(obj));
				// System.out.println("value : " + obj);
			}
		}

		return listEnum;
	}

	public static ArrayList<String> classFieldslister(String pathclass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<String> addingfields = new ArrayList<>();

		Class<?> c = Class.forName(pathclass);
		c.newInstance();
		Field fields[] = c.getDeclaredFields();
		if (fields != null) {
			for (Field field : fields) {

				addingfields.add(field.getName());

			}
		}
		return addingfields;
	}

	public static void copyFileInWorkSpace(File source, File dest) throws IOException {
		FileUtils.copyFileToDirectory(source, dest);
	}
}
