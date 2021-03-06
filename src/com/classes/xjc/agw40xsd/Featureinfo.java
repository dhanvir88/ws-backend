//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 09:46:04 PM EST 
//


package com.classes.xjc.agw40xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for featureinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="featureinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FeatureCode" type="{http://www.ericsson.com/pps/agw/04.00.00}featurecode"/>
 *         &lt;element name="FeatureStatusCode" type="{http://www.ericsson.com/pps/agw/04.00.00}featurestatuscode"/>
 *         &lt;element name="FeatureBalanceInfo" type="{http://www.ericsson.com/pps/agw/04.00.00}balanceinfo" minOccurs="0"/>
 *         &lt;element name="ServiceBalance" type="{http://www.ericsson.com/pps/agw/04.00.00}data12" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.ericsson.com/pps/agw/04.00.00}dateYMD" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "featureinfo", propOrder = {

})
public class Featureinfo {

    @XmlElement(name = "FeatureCode", required = true)
    protected String featureCode;
    @XmlElement(name = "FeatureStatusCode", required = true)
    protected BigInteger featureStatusCode;
    @XmlElement(name = "FeatureBalanceInfo")
    protected Balanceinfo featureBalanceInfo;
    @XmlElement(name = "ServiceBalance")
    protected String serviceBalance;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;

    /**
     * Gets the value of the featureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCode() {
        return featureCode;
    }

    /**
     * Sets the value of the featureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCode(String value) {
        this.featureCode = value;
    }

    /**
     * Gets the value of the featureStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeatureStatusCode() {
        return featureStatusCode;
    }

    /**
     * Sets the value of the featureStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeatureStatusCode(BigInteger value) {
        this.featureStatusCode = value;
    }

    /**
     * Gets the value of the featureBalanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Balanceinfo }
     *     
     */
    public Balanceinfo getFeatureBalanceInfo() {
        return featureBalanceInfo;
    }

    /**
     * Sets the value of the featureBalanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balanceinfo }
     *     
     */
    public void setFeatureBalanceInfo(Balanceinfo value) {
        this.featureBalanceInfo = value;
    }

    /**
     * Gets the value of the serviceBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBalance() {
        return serviceBalance;
    }

    /**
     * Sets the value of the serviceBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBalance(String value) {
        this.serviceBalance = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

}
