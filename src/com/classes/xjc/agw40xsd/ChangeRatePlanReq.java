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
 * <p>Java class for ChangeRatePlanReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRatePlanReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.00.00}MSISDN"/>
 *         &lt;element name="NewRatePlan" type="{http://www.ericsson.com/pps/agw/04.00.00}String"/>
 *         &lt;element name="NewFeatures" type="{http://www.ericsson.com/pps/agw/04.00.00}Features" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRatePlanReq", propOrder = {

})
public class ChangeRatePlanReq {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "NewRatePlan", required = true)
    protected String newRatePlan;
    @XmlElement(name = "NewFeatures")
    protected String newFeatures;

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
     * Gets the value of the newRatePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRatePlan() {
        return newRatePlan;
    }

    /**
     * Sets the value of the newRatePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRatePlan(String value) {
        this.newRatePlan = value;
    }

    /**
     * Gets the value of the newFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFeatures() {
        return newFeatures;
    }

    /**
     * Sets the value of the newFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFeatures(String value) {
        this.newFeatures = value;
    }

}
