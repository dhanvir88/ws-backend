//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 09:24:36 PM EDT 
//


package com.classes.xjc.tpspagw32xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autorenewinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autorenewinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="autorenewstatus" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}autorenewstatus"/>
 *         &lt;element name="autorenewexpirationdate" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}autorenewexpirationdate" minOccurs="0"/>
 *         &lt;element name="autorenewexecutiondate" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}autorenewexecutiondate" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autorenewinfo", propOrder = {

})
public class Autorenewinfo {

    @XmlElement(required = true)
    protected BigInteger autorenewstatus;
    protected String autorenewexpirationdate;
    protected String autorenewexecutiondate;

    /**
     * Gets the value of the autorenewstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAutorenewstatus() {
        return autorenewstatus;
    }

    /**
     * Sets the value of the autorenewstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAutorenewstatus(BigInteger value) {
        this.autorenewstatus = value;
    }

    /**
     * Gets the value of the autorenewexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorenewexpirationdate() {
        return autorenewexpirationdate;
    }

    /**
     * Sets the value of the autorenewexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorenewexpirationdate(String value) {
        this.autorenewexpirationdate = value;
    }

    /**
     * Gets the value of the autorenewexecutiondate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorenewexecutiondate() {
        return autorenewexecutiondate;
    }

    /**
     * Sets the value of the autorenewexecutiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorenewexecutiondate(String value) {
        this.autorenewexecutiondate = value;
    }

}