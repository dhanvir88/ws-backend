package com.ws.applcation.handle;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ws.application.beans.createTestStructureStepBean;
import com.ws.application.beans.itemSelectionBean;
import com.ws.application.gui.itemContentFactoryImpl;

public class dataBinding {
	public static dataBinding databinding = null;
	createTestStructureStepBean structurebean = new createTestStructureStepBean();
	itemContentFactoryImpl itemcontentfactoryimpl;
	itemSelectionBean itemselection = new itemSelectionBean();

	public void bindItemData() throws Exception {
		/// itemcontentfactoryimpl = itemContentFactoryImpl.getInstance();
		// if (structurebean.getTestCaseNumber() != null) {
		File file = new File("file.xml");
		try {
			structurebean.setXsdSelection(itemSelectionBean.xsdSelectionOnRun.getValue());
			structurebean.setRequestCallSelection(itemSelectionBean.requestCallSelectionOnRun.getValue());
			structurebean.setRequestCallSelection(itemSelectionBean.getRequestProcessingCall());
			JAXBContext jaxbContext = JAXBContext.newInstance(createTestStructureStepBean.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(structurebean, file);
			jaxbMarshaller.marshal(structurebean, System.out);

		} catch (Exception e) {

			e.printStackTrace();
		}

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(createTestStructureStepBean.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			createTestStructureStepBean customer = (createTestStructureStepBean) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	// }

	public static dataBinding getInstance() throws Exception {
		if (databinding == null) {
			databinding = new dataBinding();

		}
		return databinding;
	}
}
