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
 * <p>Java class for promotionalhistoryinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="promotionalhistoryinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PromotionCredit" type="{http://www.ericsson.com/pps/agw/04.00.00}promotioncredit"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionalhistoryinfo", propOrder = {

})
public class Promotionalhistoryinfo {

    @XmlElement(name = "PromotionCredit", required = true)
    protected Promotioncredit promotionCredit;

    /**
     * Gets the value of the promotionCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Promotioncredit }
     *     
     */
    public Promotioncredit getPromotionCredit() {
        return promotionCredit;
    }

    /**
     * Sets the value of the promotionCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotioncredit }
     *     
     */
    public void setPromotionCredit(Promotioncredit value) {
        this.promotionCredit = value;
    }

}
