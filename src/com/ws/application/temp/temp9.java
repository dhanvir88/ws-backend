package com.ws.application.temp;

import com.eviware.soapui.impl.wsdl.WsdlInterface;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.iface.Operation;

public class temp9 {

	public static void main(String[] args) throws Exception {

		String projectFile = "agw-wsdl-04-01-csi-soapui-project.xml";
		WsdlProject project = new WsdlProject(projectFile);

		WsdlInterface wsdl = (WsdlInterface) project.getInterfaceAt(0);
		for (Operation operation : wsdl.getOperationList()) {
			System.out.println(operation.getName());
			// WsdlOperation op = (WsdlOperation) operation;
			// System.out.println("OP:" + op.getName());
			// System.out.println(op.createRequest(true));
			// System.out.println("Response:");
			// System.out.println(op.createResponse(true));
		}

	}
}
