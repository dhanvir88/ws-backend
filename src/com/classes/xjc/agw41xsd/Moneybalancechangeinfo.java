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
 * <p>Java class for moneybalancechangeinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moneybalancechangeinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="balanceinfo" type="{http://www.ericsson.com/pps/agw/04.01.00}balanceinfo"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moneybalancechangeinfo", propOrder = {

})
public class Moneybalancechangeinfo {

    @XmlElement(required = true)
    protected Balanceinfo balanceinfo;

    /**
     * Gets the value of the balanceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Balanceinfo }
     *     
     */
    public Balanceinfo getBalanceinfo() {
        return balanceinfo;
    }

    /**
     * Sets the value of the balanceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balanceinfo }
     *     
     */
    public void setBalanceinfo(Balanceinfo value) {
        this.balanceinfo = value;
    }

}
