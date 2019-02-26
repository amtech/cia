//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:13 PM CET 
//


package com.hack23.cia.model.external.riksdagen.votering.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteIssueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoteIssueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sakfrågan"/&gt;
 *     &lt;enumeration value="motivfrågan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoteIssueType")
@XmlEnum
public enum VoteIssueType {

    @XmlEnumValue("sakfr\u00e5gan")
    SAKFRÅGAN("sakfr\u00e5gan"),
    @XmlEnumValue("motivfr\u00e5gan")
    MOTIVFRÅGAN("motivfr\u00e5gan");
    private final String value;

    VoteIssueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoteIssueType fromValue(String v) {
        for (VoteIssueType c: VoteIssueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}