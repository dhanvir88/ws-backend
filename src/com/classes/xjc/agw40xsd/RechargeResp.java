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
 * <p>Java class for RechargeResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechargeResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.00.00}MSISDN"/>
 *         &lt;element name="ResultDetails" type="{http://www.ericsson.com/pps/agw/04.00.00}resultdetail"/>
 *         &lt;element name="RechargeResultInformation" type="{http://www.ericsson.com/pps/agw/04.00.00}rechargeresultinfo"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeResp", propOrder = {

})
public class RechargeResp {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ResultDetails", required = true)
    protected Resultdetail resultDetails;
    @XmlElement(name = "RechargeResultInformation", required = true)
    protected Rechargeresultinfo rechargeResultInformation;

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
     * Gets the value of the resultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Resultdetail }
     *     
     */
    public Resultdetail getResultDetails() {
        return resultDetails;
    }

    /**
     * Sets the value of the resultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultdetail }
     *     
     */
    public void setResultDetails(Resultdetail value) {
        this.resultDetails = value;
    }

    /**
     * Gets the value of the rechargeResultInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Rechargeresultinfo }
     *     
     */
    public Rechargeresultinfo getRechargeResultInformation() {
        return rechargeResultInformation;
    }

    /**
     * Sets the value of the rechargeResultInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rechargeresultinfo }
     *     
     */
    public void setRechargeResultInformation(Rechargeresultinfo value) {
        this.rechargeResultInformation = value;
    }

}
