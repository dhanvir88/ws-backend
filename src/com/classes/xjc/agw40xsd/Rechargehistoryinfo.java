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
 * <p>Java class for rechargehistoryinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechargehistoryinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="recharge" type="{http://www.ericsson.com/pps/agw/04.00.00}recharge"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechargehistoryinfo", propOrder = {

})
public class Rechargehistoryinfo {

    @XmlElement(required = true)
    protected Recharge recharge;

    /**
     * Gets the value of the recharge property.
     * 
     * @return
     *     possible object is
     *     {@link Recharge }
     *     
     */
    public Recharge getRecharge() {
        return recharge;
    }

    /**
     * Sets the value of the recharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recharge }
     *     
     */
    public void setRecharge(Recharge value) {
        this.recharge = value;
    }

}
