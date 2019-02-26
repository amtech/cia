//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:47 PM CET 
//


package com.hack23.cia.model.external.val.partier.impl;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.hack23.cia.model.common.api.ModelObject;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SwedenElectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwedenElectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valtyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="region" type="{http://partier.val.external.model.cia.hack23.com/impl}SwedenElectionRegion"/&gt;
 *         &lt;element name="valbeteckning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenElectionType", propOrder = {
    "electionType",
    "region",
    "electionCode"
})
@Entity(name = "SwedenElectionType")
@Table(name = "SWEDEN_ELECTION_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenElectionType
    implements Serializable, ModelObject, Equals, HashCode
{

    @XmlElement(name = "valtyp", required = true)
    protected String electionType;
    @XmlElement(required = true)
    protected SwedenElectionRegion region;
    @XmlElement(name = "valbeteckning", required = true)
    protected String electionCode;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the electionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ELECTION_TYPE", length = 255)
    public String getElectionType() {
        return electionType;
    }

    /**
     * Sets the value of the electionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectionType(String value) {
        this.electionType = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link SwedenElectionRegion }
     *     
     */
    @ManyToOne(targetEntity = SwedenElectionRegion.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REGION_SWEDEN_ELECTION_TYPE__0")
    public SwedenElectionRegion getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwedenElectionRegion }
     *     
     */
    public void setRegion(SwedenElectionRegion value) {
        this.region = value;
    }

    /**
     * Gets the value of the electionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ELECTION_CODE", length = 255)
    public String getElectionCode() {
        return electionCode;
    }

    /**
     * Sets the value of the electionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectionCode(String value) {
        this.electionCode = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SwedenElectionType that = ((SwedenElectionType) object);
        {
            String lhsElectionType;
            lhsElectionType = this.getElectionType();
            String rhsElectionType;
            rhsElectionType = that.getElectionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electionType", lhsElectionType), LocatorUtils.property(thatLocator, "electionType", rhsElectionType), lhsElectionType, rhsElectionType)) {
                return false;
            }
        }
        {
            SwedenElectionRegion lhsRegion;
            lhsRegion = this.getRegion();
            SwedenElectionRegion rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion)) {
                return false;
            }
        }
        {
            String lhsElectionCode;
            lhsElectionCode = this.getElectionCode();
            String rhsElectionCode;
            rhsElectionCode = that.getElectionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electionCode", lhsElectionCode), LocatorUtils.property(thatLocator, "electionCode", rhsElectionCode), lhsElectionCode, rhsElectionCode)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theElectionType;
            theElectionType = this.getElectionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electionType", theElectionType), currentHashCode, theElectionType);
        }
        {
            SwedenElectionRegion theRegion;
            theRegion = this.getRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "region", theRegion), currentHashCode, theRegion);
        }
        {
            String theElectionCode;
            theElectionCode = this.getElectionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electionCode", theElectionCode), currentHashCode, theElectionCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}