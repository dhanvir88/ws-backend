//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.25 at 05:15:19 PM EST 
//


package com.classes.xjc.agw41xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.01.00}MSISDN"/>
 *         &lt;element name="PaymentAmount" type="{http://www.ericsson.com/pps/agw/04.01.00}Integer"/>
 *         &lt;element name="PaymentTypeCode" type="{http://www.ericsson.com/pps/agw/04.01.00}paymenttypecode"/>
 *         &lt;element name="VoucherActivationNumber" type="{http://www.ericsson.com/pps/agw/04.01.00}voucheractivationnumber" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReq", propOrder = {

})
public class PaymentReq {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "PaymentAmount", required = true)
    protected BigInteger paymentAmount;
    @XmlElement(name = "PaymentTypeCode")
    @XmlSchemaType(name = "integer")
    protected int paymentTypeCode;
    @XmlElement(name = "VoucherActivationNumber")
    protected String voucherActivationNumber;

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
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentAmount(BigInteger value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     */
    public int getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     */
    public void setPaymentTypeCode(int value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the voucherActivationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherActivationNumber() {
        return voucherActivationNumber;
    }

    /**
     * Sets the value of the voucherActivationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherActivationNumber(String value) {
        this.voucherActivationNumber = value;
    }

}
