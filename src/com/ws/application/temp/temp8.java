package com.ws.application.temp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class temp8 {
	public static ArrayList<String> xsdComplexElemnts = new ArrayList<>();

	public static void main(String args[]) {
		try {
			// parse the document
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File("F:/ATTPrepaid/F424/agw_4.1.xsd"));
			NodeList list = doc.getElementsByTagName("xsd:complexType");
			if (list != null && list.getLength() > 0) {
				for (int j = 0; j < list.getLength(); j++) {
					Element el = (org.w3c.dom.Element) list.item(j);
					// type_id = Integer.parseInt(el.getAttribute("type_id"));
					System.out.println("type id:" + el);
				}
			}
			// loop to print data
			for (int i = 0; i < list.getLength(); i++) {
				Element first = (Element) list.item(i);
				if (first.hasAttributes()) {
					String nm = first.getAttribute("name");
					if (nm != null) {
						// xsdComplexElemnts.add(nm);
					}
					System.out.println("xsdreq:   " + xsdComplexElemnts.add(nm));
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException ed) {
			ed.printStackTrace();
		}

		System.out.println(xsdComplexElemnts);
	}
}
