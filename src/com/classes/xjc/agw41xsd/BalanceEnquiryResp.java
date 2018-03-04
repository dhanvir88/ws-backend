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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceEnquiryResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceEnquiryResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.01.00}MSISDN"/>
 *         &lt;element name="ResultCode" type="{http://www.ericsson.com/pps/agw/04.01.00}String"/>
 *         &lt;element name="BalanceAmount" type="{http://www.ericsson.com/pps/agw/04.01.00}amount"/>
 *         &lt;element name="AirTimeExpiration" type="{http://www.ericsson.com/pps/agw/04.01.00}dateYMD"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceEnquiryResp", propOrder = {

})
public class BalanceEnquiryResp {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "BalanceAmount")
    @XmlSchemaType(name = "integer")
    protected long balanceAmount;
    @XmlElement(name = "AirTimeExpiration", required = true)
    protected String airTimeExpiration;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     */
    public long getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     */
    public void setBalanceAmount(long value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the airTimeExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirTimeExpiration() {
        return airTimeExpiration;
    }

    /**
     * Sets the value of the airTimeExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirTimeExpiration(String value) {
        this.airTimeExpiration = value;
    }

}