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
 * <p>Java class for ChangeMultiLineResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMultiLineResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryInformation" type="{http://www.ericsson.com/pps/agw/04.01.00}multilineInformationResp" minOccurs="0"/>
 *         &lt;element name="MemberInformation" type="{http://www.ericsson.com/pps/agw/04.01.00}multilineInformationResp" minOccurs="0"/>
 *         &lt;element name="CSIconversationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invites" type="{http://www.ericsson.com/pps/agw/04.01.00}invites" minOccurs="0"/>
 *         &lt;element name="ResultDetails" type="{http://www.ericsson.com/pps/agw/04.01.00}resultdetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMultiLineResp", propOrder = {
    "primaryInformation",
    "memberInformation",
    "csIconversationId",
    "invites",
    "resultDetails"
})
public class ChangeMultiLineResp {

    @XmlElement(name = "PrimaryInformation")
    protected MultilineInformationResp primaryInformation;
    @XmlElement(name = "MemberInformation")
    protected MultilineInformationResp memberInformation;
    @XmlElement(name = "CSIconversationId")
    protected String csIconversationId;
    @XmlElement(name = "Invites")
    protected Invites invites;
    @XmlElement(name = "ResultDetails", required = true)
    protected Resultdetail resultDetails;

    /**
     * Gets the value of the primaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilineInformationResp }
     *     
     */
    public MultilineInformationResp getPrimaryInformation() {
        return primaryInformation;
    }

    /**
     * Sets the value of the primaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilineInformationResp }
     *     
     */
    public void setPrimaryInformation(MultilineInformationResp value) {
        this.primaryInformation = value;
    }

    /**
     * Gets the value of the memberInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilineInformationResp }
     *     
     */
    public MultilineInformationResp getMemberInformation() {
        return memberInformation;
    }

    /**
     * Sets the value of the memberInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilineInformationResp }
     *     
     */
    public void setMemberInformation(MultilineInformationResp value) {
        this.memberInformation = value;
    }

    /**
     * Gets the value of the csIconversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSIconversationId() {
        return csIconversationId;
    }

    /**
     * Sets the value of the csIconversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSIconversationId(String value) {
        this.csIconversationId = value;
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

}