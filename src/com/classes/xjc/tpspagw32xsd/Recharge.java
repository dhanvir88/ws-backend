//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 09:24:36 PM EDT 
//


package com.classes.xjc.tpspagw32xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="voucheractivationnumber" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}voucheractivationnumber"/>
 *         &lt;element name="rechargevalue" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}quantity"/>
 *         &lt;element name="rechargedatetime" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}datetime"/>
 *         &lt;element name="rechargetimezone" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}timezone"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recharge", propOrder = {

})
public class Recharge {

    @XmlElement(required = true)
    protected String voucheractivationnumber;
    @XmlElement(required = true)
    protected String rechargevalue;
    @XmlElement(required = true)
    protected String rechargedatetime;
    @XmlElement(required = true)
    protected String rechargetimezone;

    /**
     * Gets the value of the voucheractivationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucheractivationnumber() {
        return voucheractivationnumber;
    }

    /**
     * Sets the value of the voucheractivationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucheractivationnumber(String value) {
        this.voucheractivationnumber = value;
    }

    /**
     * Gets the value of the rechargevalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargevalue() {
        return rechargevalue;
    }

    /**
     * Sets the value of the rechargevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargevalue(String value) {
        this.rechargevalue = value;
    }

    /**
     * Gets the value of the rechargedatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargedatetime() {
        return rechargedatetime;
    }

    /**
     * Sets the value of the rechargedatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargedatetime(String value) {
        this.rechargedatetime = value;
    }

    /**
     * Gets the value of the rechargetimezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargetimezone() {
        return rechargetimezone;
    }

    /**
     * Sets the value of the rechargetimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargetimezone(String value) {
        this.rechargetimezone = value;
    }

}