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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRatePlansReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRatePlansReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PrimaryMSISDN" type="{http://www.ericsson.com/pps/agw/04.00.00}MSISDN" minOccurs="0"/>
 *         &lt;element name="MemberMSISDN" type="{http://www.ericsson.com/pps/agw/04.00.00}MSISDN" minOccurs="0"/>
 *         &lt;element name="CSIconversationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.ericsson.com/pps/agw/04.00.00}mode"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRatePlansReq", propOrder = {

})
public class GetRatePlansReq {

    @XmlElement(name = "PrimaryMSISDN")
    protected String primaryMSISDN;
    @XmlElement(name = "MemberMSISDN")
    protected String memberMSISDN;
    @XmlElement(name = "CSIconversationId")
    protected String csIconversationId;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected Mode mode;

    /**
     * Gets the value of the primaryMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryMSISDN() {
        return primaryMSISDN;
    }

    /**
     * Sets the value of the primaryMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryMSISDN(String value) {
        this.primaryMSISDN = value;
    }

    /**
     * Gets the value of the memberMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMSISDN() {
        return memberMSISDN;
    }

    /**
     * Sets the value of the memberMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberMSISDN(String value) {
        this.memberMSISDN = value;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Mode }
     *     
     */
    public Mode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mode }
     *     
     */
    public void setMode(Mode value) {
        this.mode = value;
    }

}
