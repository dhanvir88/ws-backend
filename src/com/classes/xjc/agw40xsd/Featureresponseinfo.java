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
 * <p>Java class for featureresponseinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="featureresponseinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FeatureCode" type="{http://www.ericsson.com/pps/agw/04.00.00}featurecode"/>
 *         &lt;element name="FeatureActionResultCode" type="{http://www.ericsson.com/pps/agw/04.00.00}featureresultcode"/>
 *         &lt;element name="FeatureBalanceInfo" type="{http://www.ericsson.com/pps/agw/04.00.00}balanceinfo" minOccurs="0"/>
 *         &lt;element name="FeatureBalanceChangeInfo" type="{http://www.ericsson.com/pps/agw/04.00.00}balanceinfo" minOccurs="0"/>
 *         &lt;element name="ServiceBalance" type="{http://www.ericsson.com/pps/agw/04.00.00}data12" minOccurs="0"/>
 *         &lt;element name="ServiceBalanceChange" type="{http://www.ericsson.com/pps/agw/04.00.00}data12" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "featureresponseinfo", propOrder = {

})
public class Featureresponseinfo {

    @XmlElement(name = "FeatureCode", required = true)
    protected String featureCode;
    @XmlElement(name = "FeatureActionResultCode", required = true)
    protected BigInteger featureActionResultCode;
    @XmlElement(name = "FeatureBalanceInfo")
    protected Balanceinfo featureBalanceInfo;
    @XmlElement(name = "FeatureBalanceChangeInfo")
    protected Balanceinfo featureBalanceChangeInfo;
    @XmlElement(name = "ServiceBalance")
    protected String serviceBalance;
    @XmlElement(name = "ServiceBalanceChange")
    protected String serviceBalanceChange;

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
     * Gets the value of the featureActionResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeatureActionResultCode() {
        return featureActionResultCode;
    }

    /**
     * Sets the value of the featureActionResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeatureActionResultCode(BigInteger value) {
        this.featureActionResultCode = value;
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
     * Gets the value of the featureBalanceChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Balanceinfo }
     *     
     */
    public Balanceinfo getFeatureBalanceChangeInfo() {
        return featureBalanceChangeInfo;
    }

    /**
     * Sets the value of the featureBalanceChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balanceinfo }
     *     
     */
    public void setFeatureBalanceChangeInfo(Balanceinfo value) {
        this.featureBalanceChangeInfo = value;
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
     * Gets the value of the serviceBalanceChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBalanceChange() {
        return serviceBalanceChange;
    }

    /**
     * Sets the value of the serviceBalanceChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBalanceChange(String value) {
        this.serviceBalanceChange = value;
    }

}