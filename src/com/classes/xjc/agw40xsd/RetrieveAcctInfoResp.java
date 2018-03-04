//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 09:46:04 PM EST 
//


package com.classes.xjc.agw40xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveAcctInfoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveAcctInfoResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.00.00}MSISDN"/>
 *         &lt;element name="ResultDetails" type="{http://www.ericsson.com/pps/agw/04.00.00}resultdetail"/>
 *         &lt;element name="AccountInformation" type="{http://www.ericsson.com/pps/agw/04.00.00}accountinformationrai"/>
 *         &lt;element name="RatePlanInfo" type="{http://www.ericsson.com/pps/agw/04.00.00}rateplaninforai"/>
 *         &lt;element name="FeatureInfo" type="{http://www.ericsson.com/pps/agw/04.00.00}featureinfo" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveAcctInfoResp", propOrder = {
    "msisdn",
    "resultDetails",
    "accountInformation",
    "ratePlanInfo",
    "featureInfo"
})
public class RetrieveAcctInfoResp {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ResultDetails", required = true)
    protected Resultdetail resultDetails;
    @XmlElement(name = "AccountInformation", required = true)
    protected Accountinformationrai accountInformation;
    @XmlElement(name = "RatePlanInfo", required = true)
    protected Rateplaninforai ratePlanInfo;
    @XmlElement(name = "FeatureInfo")
    protected List<Featureinfo> featureInfo;

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
     * Gets the value of the accountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Accountinformationrai }
     *     
     */
    public Accountinformationrai getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountinformationrai }
     *     
     */
    public void setAccountInformation(Accountinformationrai value) {
        this.accountInformation = value;
    }

    /**
     * Gets the value of the ratePlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Rateplaninforai }
     *     
     */
    public Rateplaninforai getRatePlanInfo() {
        return ratePlanInfo;
    }

    /**
     * Sets the value of the ratePlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateplaninforai }
     *     
     */
    public void setRatePlanInfo(Rateplaninforai value) {
        this.ratePlanInfo = value;
    }

    /**
     * Gets the value of the featureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Featureinfo }
     * 
     * 
     */
    public List<Featureinfo> getFeatureInfo() {
        if (featureInfo == null) {
            featureInfo = new ArrayList<Featureinfo>();
        }
        return this.featureInfo;
    }

}
