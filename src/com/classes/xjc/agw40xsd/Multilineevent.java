//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 09:46:04 PM EST 
//


package com.classes.xjc.agw40xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multilineevent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="multilineevent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENROLL"/>
 *     &lt;enumeration value="INVITESENT"/>
 *     &lt;enumeration value="INVITEACCEPTED"/>
 *     &lt;enumeration value="INVITEDECLINED"/>
 *     &lt;enumeration value="INVITECANCELLED"/>
 *     &lt;enumeration value="PRIMARYLEAVE"/>
 *     &lt;enumeration value="MEMBERREMOVE"/>
 *     &lt;enumeration value="MEMBERLEAVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "multilineevent")
@XmlEnum
public enum Multilineevent {

    ENROLL,
    INVITESENT,
    INVITEACCEPTED,
    INVITEDECLINED,
    INVITECANCELLED,
    PRIMARYLEAVE,
    MEMBERREMOVE,
    MEMBERLEAVE;

    public String value() {
        return name();
    }

    public static Multilineevent fromValue(String v) {
        return valueOf(v);
    }

}