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
 * <p>Java class for paymentresponseinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentresponseinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="airtimeexpiration" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}airtimeexpiration"/>
 *         &lt;element name="servicebalancechangeinfo" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}servicebalancechangeinfo"/>
 *         &lt;element name="moneybalanceinfo" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}moneybalanceinfo"/>
 *         &lt;element name="promotionalairtimedays" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}promotionalairtimedays" minOccurs="0"/>
 *         &lt;element name="promotionalvalue" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}promotionalvalue" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentresponseinfo", propOrder = {

})
public class Paymentresponseinfo {

    @XmlElement(required = true)
    protected String airtimeexpiration;
    @XmlElement(required = true)
    protected Servicebalancechangeinfo servicebalancechangeinfo;
    @XmlElement(required = true)
    protected Moneybalanceinfo moneybalanceinfo;
    @XmlSchemaType(name = "integer")
    protected Integer promotionalairtimedays;
    protected Promotionalvalue promotionalvalue;

    /**
     * Gets the value of the airtimeexpiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirtimeexpiration() {
        return airtimeexpiration;
    }

    /**
     * Sets the value of the airtimeexpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirtimeexpiration(String value) {
        this.airtimeexpiration = value;
    }

    /**
     * Gets the value of the servicebalancechangeinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Servicebalancechangeinfo }
     *     
     */
    public Servicebalancechangeinfo getServicebalancechangeinfo() {
        return servicebalancechangeinfo;
    }

    /**
     * Sets the value of the servicebalancechangeinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicebalancechangeinfo }
     *     
     */
    public void setServicebalancechangeinfo(Servicebalancechangeinfo value) {
        this.servicebalancechangeinfo = value;
    }

    /**
     * Gets the value of the moneybalanceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Moneybalanceinfo }
     *     
     */
    public Moneybalanceinfo getMoneybalanceinfo() {
        return moneybalanceinfo;
    }

    /**
     * Sets the value of the moneybalanceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moneybalanceinfo }
     *     
     */
    public void setMoneybalanceinfo(Moneybalanceinfo value) {
        this.moneybalanceinfo = value;
    }

    /**
     * Gets the value of the promotionalairtimedays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotionalairtimedays() {
        return promotionalairtimedays;
    }

    /**
     * Sets the value of the promotionalairtimedays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotionalairtimedays(Integer value) {
        this.promotionalairtimedays = value;
    }

    /**
     * Gets the value of the promotionalvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Promotionalvalue }
     *     
     */
    public Promotionalvalue getPromotionalvalue() {
        return promotionalvalue;
    }

    /**
     * Sets the value of the promotionalvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotionalvalue }
     *     
     */
    public void setPromotionalvalue(Promotionalvalue value) {
        this.promotionalvalue = value;
    }

}