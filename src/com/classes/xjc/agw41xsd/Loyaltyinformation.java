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
 * <p>Java class for loyaltyinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loyaltyinformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LoyaltyTier" type="{http://www.ericsson.com/pps/agw/04.01.00}data12"/>
 *         &lt;element name="LoyaltyBalance" type="{http://www.ericsson.com/pps/agw/04.01.00}data12"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loyaltyinformation", propOrder = {

})
public class Loyaltyinformation {

    @XmlElement(name = "LoyaltyTier", required = true)
    protected String loyaltyTier;
    @XmlElement(name = "LoyaltyBalance", required = true)
    protected String loyaltyBalance;

    /**
     * Gets the value of the loyaltyTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyTier() {
        return loyaltyTier;
    }

    /**
     * Sets the value of the loyaltyTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyTier(String value) {
        this.loyaltyTier = value;
    }

    /**
     * Gets the value of the loyaltyBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyBalance() {
        return loyaltyBalance;
    }

    /**
     * Sets the value of the loyaltyBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyBalance(String value) {
        this.loyaltyBalance = value;
    }

}
