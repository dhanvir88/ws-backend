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
 * <p>Java class for paymentinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="moneyinformation" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}moneyinformation"/>
 *         &lt;element name="paymenttypecode" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}paymenttypecode"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentinfo", propOrder = {

})
public class Paymentinfo {

    @XmlElement(required = true)
    protected Moneyinformation moneyinformation;
    @XmlSchemaType(name = "integer")
    protected int paymenttypecode;

    /**
     * Gets the value of the moneyinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Moneyinformation }
     *     
     */
    public Moneyinformation getMoneyinformation() {
        return moneyinformation;
    }

    /**
     * Sets the value of the moneyinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moneyinformation }
     *     
     */
    public void setMoneyinformation(Moneyinformation value) {
        this.moneyinformation = value;
    }

    /**
     * Gets the value of the paymenttypecode property.
     * 
     */
    public int getPaymenttypecode() {
        return paymenttypecode;
    }

    /**
     * Sets the value of the paymenttypecode property.
     * 
     */
    public void setPaymenttypecode(int value) {
        this.paymenttypecode = value;
    }

}