//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 09:24:36 PM EDT 
//


package com.classes.xjc.tpspagw32xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateplanchangehistoryinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateplanchangehistoryinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rateplanchangecounter" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}rateplanchangecounter"/>
 *         &lt;element name="lastchangedate" type="{http://www.ericsson.com/pps/tpspagw/03.02.00}datetime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateplanchangehistoryinfo", propOrder = {

})
public class Rateplanchangehistoryinfo {

    @XmlElement(required = true)
    protected BigInteger rateplanchangecounter;
    @XmlElement(required = true)
    protected String lastchangedate;

    /**
     * Gets the value of the rateplanchangecounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateplanchangecounter() {
        return rateplanchangecounter;
    }

    /**
     * Sets the value of the rateplanchangecounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateplanchangecounter(BigInteger value) {
        this.rateplanchangecounter = value;
    }

    /**
     * Gets the value of the lastchangedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastchangedate() {
        return lastchangedate;
    }

    /**
     * Sets the value of the lastchangedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastchangedate(String value) {
        this.lastchangedate = value;
    }

}
