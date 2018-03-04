package com.ws.application.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTestStructureStepBean", propOrder = { "testCaseNumber", "testCaseDescription", "testStepNumber", "xsdSelection", "requestCallSelection", "responseRecievedSelection", "requestParamterSelection", "responseParamterSelection", })
public class createTestStructureStepBean {
	@XmlElement(name = "testCaseNumber")
	protected String testCaseNumber = null;
	@XmlElement(name = "testCaseDescription")
	protected String testCaseDescription = null;
	@XmlElement(name = "testStepNumber")
	protected String testStepNumber = null;
	@XmlElement(name = "xsdSelection")
	protected String xsdSelection = null;
	@XmlElement(name = "requestCallSelection")
	protected String requestCallSelection = null;
	@XmlElement(name = "responseRecievedSelection")
	protected String responseRecievedSelection = null;
	@XmlElement(name = "requestParamterSelection")
	protected String requestParamterSelection = null;
	@XmlElement(name = "responseParamterSelection")
	protected String responseParamterSelection = null;

	public String getTestCaseDescription() {
		return testCaseDescription;
	}

	public void setTestCaseDescription(String testCaseDescription) {
		this.testCaseDescription = testCaseDescription;
	}

	public String getTestCaseNumber() {
		return testCaseNumber;
	}

	public void setTestCaseNumber(String testCaseNumber) {
		this.testCaseNumber = testCaseNumber;
	}

	public String getTestStepNumber() {
		return testStepNumber;
	}

	public void setTestStepNumber(String testStepNumber) {
		this.testStepNumber = testStepNumber;
	}

	public String getXsdSelection() {
		return xsdSelection;
	}

	public void setXsdSelection(String actionDropDown) {
		this.xsdSelection = actionDropDown;
	}

	public String getRequestCallSelection() {
		return requestCallSelection;
	}

	public void setRequestCallSelection(String requestCallSelection) {
		this.requestCallSelection = requestCallSelection;
	}

	public String getResponseRecievedSelection() {
		return responseRecievedSelection;
	}

	public void setResponseRecievedSelection(String responseRecievedSelection) {
		this.responseRecievedSelection = responseRecievedSelection;
	}

	public String getRequestParamterSelection() {
		return requestParamterSelection;
	}

	public void setRequestParamterSelection(String requestParamterSelection) {
		this.requestParamterSelection = requestParamterSelection;
	}

	public String getResponseParamterSelection() {
		return responseParamterSelection;
	}

	public void setResponseParamterSelection(String responseParamterSelection) {
		this.responseParamterSelection = responseParamterSelection;
	}
}
