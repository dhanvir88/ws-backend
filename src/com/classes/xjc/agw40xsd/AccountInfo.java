//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 09:46:04 PM EST 
//


package com.classes.xjc.agw40xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moneyBalanceInfoML" type="{http://www.ericsson.com/pps/agw/04.00.00}moneybalanceinfo" minOccurs="0"/>
 *         &lt;element name="totalAmountDueDynamic" type="{http://www.ericsson.com/pps/agw/04.00.00}quantity"/>
 *         &lt;element name="totalAmountMRC" type="{http://www.ericsson.com/pps/agw/04.00.00}quantity"/>
 *         &lt;element name="totalSavingsAmount" type="{http://www.ericsson.com/pps/agw/04.00.00}quantity"/>
 *         &lt;element name="allowedInvitations" type="{http://www.ericsson.com/pps/agw/04.00.00}quantity"/>
 *         &lt;element name="proAmount" type="{http://www.ericsson.com/pps/agw/04.00.00}quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountInfo", propOrder = {
    "moneyBalanceInfoML",
    "totalAmountDueDynamic",
    "totalAmountMRC",
    "totalSavingsAmount",
    "allowedInvitations",
    "proAmount"
})
public class AccountInfo {

    protected Moneybalanceinfo moneyBalanceInfoML;
    @XmlElement(required = true)
    protected String totalAmountDueDynamic;
    @XmlElement(required = true)
    protected String totalAmountMRC;
    @XmlElement(required = true)
    protected String totalSavingsAmount;
    @XmlElement(required = true)
    protected String allowedInvitations;
    protected String proAmount;

    /**
     * Gets the value of the moneyBalanceInfoML property.
     * 
     * @return
     *     possible object is
     *     {@link Moneybalanceinfo }
     *     
     */
    public Moneybalanceinfo getMoneyBalanceInfoML() {
        return moneyBalanceInfoML;
    }

    /**
     * Sets the value of the moneyBalanceInfoML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moneybalanceinfo }
     *     
     */
    public void setMoneyBalanceInfoML(Moneybalanceinfo value) {
        this.moneyBalanceInfoML = value;
    }

    /**
     * Gets the value of the totalAmountDueDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmountDueDynamic() {
        return totalAmountDueDynamic;
    }

    /**
     * Sets the value of the totalAmountDueDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmountDueDynamic(String value) {
        this.totalAmountDueDynamic = value;
    }

    /**
     * Gets the value of the totalAmountMRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmountMRC() {
        return totalAmountMRC;
    }

    /**
     * Sets the value of the totalAmountMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmountMRC(String value) {
        this.totalAmountMRC = value;
    }

    /**
     * Gets the value of the totalSavingsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSavingsAmount() {
        return totalSavingsAmount;
    }

    /**
     * Sets the value of the totalSavingsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSavingsAmount(String value) {
        this.totalSavingsAmount = value;
    }

    /**
     * Gets the value of the allowedInvitations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedInvitations() {
        return allowedInvitations;
    }

    /**
     * Sets the value of the allowedInvitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedInvitations(String value) {
        this.allowedInvitations = value;
    }

    /**
     * Gets the value of the proAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProAmount() {
        return proAmount;
    }

    /**
     * Sets the value of the proAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProAmount(String value) {
        this.proAmount = value;
    }

}
