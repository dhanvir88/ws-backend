package com.ws.application.temp;

import java.util.Map;
import java.util.Map.Entry;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;
//import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class MyNamespaceMapper extends NamespacePrefixMapper {
	private String[] namespaces;

	public MyNamespaceMapper(Map<String, String> namespaces) {
		this.namespaces = new String[namespaces.size() * 2];
		int index = 0;
		for (Entry<String, String> entry : namespaces.entrySet()) {
			this.namespaces[index++] = entry.getKey();
			this.namespaces[index++] = entry.getValue();
		}
	}

	@Override
	public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
		return "ns1";
	}

	@Override
	public String[] getPreDeclaredNamespaceUris2() {
		return namespaces;
	}

}
