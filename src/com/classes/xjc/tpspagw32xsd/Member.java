//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 09:24:36 PM EDT 
//


package com.classes.xjc.tpspagw32xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}msisdn"/>
 *         &lt;element name="rateplancode" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}rateplancode"/>
 *         &lt;element name="rateplanstatus" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}rateplanstatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member", propOrder = {
    "msisdn",
    "rateplancode",
    "rateplanstatus"
})
public class Member {

    @XmlSchemaType(name = "integer")
    protected long msisdn;
    @XmlElement(required = true)
    protected String rateplancode;
    @XmlElement(required = true)
    protected Rateplanstatus rateplanstatus;

    /**
     * Gets the value of the msisdn property.
     * 
     */
    public long getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     */
    public void setMsisdn(long value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the rateplancode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateplancode() {
        return rateplancode;
    }

    /**
     * Sets the value of the rateplancode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateplancode(String value) {
        this.rateplancode = value;
    }

    /**
     * Gets the value of the rateplanstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Rateplanstatus }
     *     
     */
    public Rateplanstatus getRateplanstatus() {
        return rateplanstatus;
    }

    /**
     * Sets the value of the rateplanstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateplanstatus }
     *     
     */
    public void setRateplanstatus(Rateplanstatus value) {
        this.rateplanstatus = value;
    }

}