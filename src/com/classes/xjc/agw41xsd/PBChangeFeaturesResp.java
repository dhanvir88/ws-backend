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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PBChangeFeaturesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PBChangeFeaturesResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://www.ericsson.com/pps/agw/04.01.00}MSISDN"/>
 *         &lt;element name="ResultDetails" type="{http://www.ericsson.com/pps/agw/04.01.00}resultdetail"/>
 *         &lt;element name="LoyaltyInformation" type="{http://www.ericsson.com/pps/agw/04.01.00}loyaltyinformation" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://www.ericsson.com/pps/agw/04.01.00}amount" minOccurs="0"/>
 *         &lt;element name="AirTimeExpiration" type="{http://www.ericsson.com/pps/agw/04.01.00}dateYMD" minOccurs="0"/>
 *         &lt;element name="FeatureResponseInfo" type="{http://www.ericsson.com/pps/agw/04.01.00}featureresponseinfo" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PBChangeFeaturesResp", propOrder = {
    "msisdn",
    "resultDetails",
    "loyaltyInformation",
    "balanceAmount",
    "airTimeExpiration",
    "featureResponseInfo"
})
public class PBChangeFeaturesResp {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ResultDetails", required = true)
    protected Resultdetail resultDetails;
    @XmlElement(name = "LoyaltyInformation")
    protected Loyaltyinformation loyaltyInformation;
    @XmlElement(name = "BalanceAmount")
    @XmlSchemaType(name = "integer")
    protected Long balanceAmount;
    @XmlElement(name = "AirTimeExpiration")
    protected String airTimeExpiration;
    @XmlElement(name = "FeatureResponseInfo", required = true)
    protected List<Featureresponseinfo> featureResponseInfo;

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
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceAmount(Long value) {
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

    /**
     * Gets the value of the featureResponseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureResponseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureResponseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Featureresponseinfo }
     * 
     * 
     */
    public List<Featureresponseinfo> getFeatureResponseInfo() {
        if (featureResponseInfo == null) {
            featureResponseInfo = new ArrayList<Featureresponseinfo>();
        }
        return this.featureResponseInfo;
    }

}
