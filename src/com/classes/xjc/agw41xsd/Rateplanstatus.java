//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.25 at 05:15:19 PM EST 
//


package com.classes.xjc.agw41xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateplanstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateplanstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RatePlanStatusCode" type="{http://www.ericsson.com/pps/agw/04.01.00}rateplanstatuscode"/>
 *         &lt;element name="RatePlanStatusReasonCode" type="{http://www.ericsson.com/pps/agw/04.01.00}rateplanstatusreasoncode" minOccurs="0"/>
 *         &lt;element name="RatePlanStatusString" type="{http://www.ericsson.com/pps/agw/04.01.00}rateplanstatusstring" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateplanstatus", propOrder = {

})
public class Rateplanstatus {

    @XmlElement(name = "RatePlanStatusCode", required = true)
    protected BigInteger ratePlanStatusCode;
    @XmlElement(name = "RatePlanStatusReasonCode")
    protected BigInteger ratePlanStatusReasonCode;
    @XmlElement(name = "RatePlanStatusString")
    protected String ratePlanStatusString;

    /**
     * Gets the value of the ratePlanStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatePlanStatusCode() {
        return ratePlanStatusCode;
    }

    /**
     * Sets the value of the ratePlanStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatePlanStatusCode(BigInteger value) {
        this.ratePlanStatusCode = value;
    }

    /**
     * Gets the value of the ratePlanStatusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatePlanStatusReasonCode() {
        return ratePlanStatusReasonCode;
    }

    /**
     * Sets the value of the ratePlanStatusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatePlanStatusReasonCode(BigInteger value) {
        this.ratePlanStatusReasonCode = value;
    }

    /**
     * Gets the value of the ratePlanStatusString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanStatusString() {
        return ratePlanStatusString;
    }

    /**
     * Sets the value of the ratePlanStatusString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanStatusString(String value) {
        this.ratePlanStatusString = value;
    }

}
