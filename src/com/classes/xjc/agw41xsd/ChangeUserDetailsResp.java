//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.25 at 05:15:19 PM EST 
//


package com.classes.xjc.agw41xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeUserDetailsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeUserDetailsResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ResultCode" type="{http://www.ericsson.com/pps/agw/04.01.00}String"/>
 *         &lt;element name="FailedUserDetails" type="{http://www.ericsson.com/pps/agw/04.01.00}SubscriberDetails" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeUserDetailsResp", propOrder = {

})
public class ChangeUserDetailsResp {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "FailedUserDetails")
    protected SubscriberDetails failedUserDetails;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the failedUserDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberDetails }
     *     
     */
    public SubscriberDetails getFailedUserDetails() {
        return failedUserDetails;
    }

    /**
     * Sets the value of the failedUserDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberDetails }
     *     
     */
    public void setFailedUserDetails(SubscriberDetails value) {
        this.failedUserDetails = value;
    }

}