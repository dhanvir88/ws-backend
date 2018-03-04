package com.ws.application.temp;

import javax.xml.bind.annotation.XmlNsForm;

public @interface XmlSchema {

	java.lang.String namespace();

	XmlNsForm elementFormDefault();

	XmlNs[] xmlns();

}
