//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.25 at 05:15:19 PM EST 
//


package com.classes.xjc.agw41xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveAcctDetailsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveAcctDetailsResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.01.00}MSISDN"/>
 *         &lt;element name="ResultDetails" type="{http://www.ericsson.com/pps/agw/04.01.00}resultdetail"/>
 *         &lt;element name="AccountInformation" type="{http://www.ericsson.com/pps/agw/04.01.00}accountinformation"/>
 *         &lt;element name="RatePlanInfo" type="{http://www.ericsson.com/pps/agw/04.01.00}rateplaninfo"/>
 *         &lt;element name="LoyaltyInformation" type="{http://www.ericsson.com/pps/agw/04.01.00}loyaltyinformation" minOccurs="0"/>
 *         &lt;element name="RatePlanChangeHistoryInfo" type="{http://www.ericsson.com/pps/agw/04.01.00}rateplanchangehistoryinfo" minOccurs="0"/>
 *         &lt;element name="FeatureInfo" type="{http://www.ericsson.com/pps/agw/04.01.00}featureinfo" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="Invites" type="{http://www.ericsson.com/pps/agw/04.01.00}invites" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveAcctDetailsResp", propOrder = {
    "msisdn",
    "resultDetails",
    "accountInformation",
    "ratePlanInfo",
    "loyaltyInformation",
    "ratePlanChangeHistoryInfo",
    "featureInfo",
    "invites"
})
public class RetrieveAcctDetailsResp {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ResultDetails", required = true)
    protected Resultdetail resultDetails;
    @XmlElement(name = "AccountInformation", required = true)
    protected Accountinformation accountInformation;
    @XmlElement(name = "RatePlanInfo", required = true)
    protected Rateplaninfo ratePlanInfo;
    @XmlElement(name = "LoyaltyInformation")
    protected Loyaltyinformation loyaltyInformation;
    @XmlElement(name = "RatePlanChangeHistoryInfo")
    protected Rateplanchangehistoryinfo ratePlanChangeHistoryInfo;
    @XmlElement(name = "FeatureInfo")
    protected List<Featureinfo> featureInfo;
    @XmlElement(name = "Invites")
    protected Invites invites;

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
     *     {@link Accountinformation }
     *     
     */
    public Accountinformation getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountinformation }
     *     
     */
    public void setAccountInformation(Accountinformation value) {
        this.accountInformation = value;
    }

    /**
     * Gets the value of the ratePlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Rateplaninfo }
     *     
     */
    public Rateplaninfo getRatePlanInfo() {
        return ratePlanInfo;
    }

    /**
     * Sets the value of the ratePlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateplaninfo }
     *     
     */
    public void setRatePlanInfo(Rateplaninfo value) {
        this.ratePlanInfo = value;
    }

    /**
     * Gets the value of the loyaltyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Loyaltyinformation }
     *     
     */
    public Loyaltyinformation getLoyaltyInformation() {
        return loyaltyInformation;
    }

    /**
     * Sets the value of the loyaltyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loyaltyinformation }
     *     
     */
    public void setLoyaltyInformation(Loyaltyinformation value) {
        this.loyaltyInformation = value;
    }

    /**
     * Gets the value of the ratePlanChangeHistoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Rateplanchangehistoryinfo }
     *     
     */
    public Rateplanchangehistoryinfo getRatePlanChangeHistoryInfo() {
        return ratePlanChangeHistoryInfo;
    }

    /**
     * Sets the value of the ratePlanChangeHistoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateplanchangehistoryinfo }
     *     
     */
    public void setRatePlanChangeHistoryInfo(Rateplanchangehistoryinfo value) {
        this.ratePlanChangeHistoryInfo = value;
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

    /**
     * Gets the value of the invites property.
     * 
     * @return
     *     possible object is
     *     {@link Invites }
     *     
     */
    public Invites getInvites() {
        return invites;
    }

    /**
     * Sets the value of the invites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invites }
     *     
     */
    public void setInvites(Invites value) {
        this.invites = value;
    }

}
