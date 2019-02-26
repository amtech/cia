//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.party.impl;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.hack23.cia.model.common.api.ModelObject;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ViewRiksdagenPartyBallotSupportAnnualSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenPartyBallotSupportAnnualSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://party.data.application.internal.model.cia.hack23.com/impl}ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId"/&gt;
 *         &lt;element name="disagre_count" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="agree_count" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="disagree_percentage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="total_ballots" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPartyBallotSupportAnnualSummary", propOrder = {
    "embeddedId",
    "disagreCount",
    "agreeCount",
    "disagreePercentage",
    "totalBallots"
})
@Entity(name = "ViewRiksdagenPartyBallotSupportAnnualSummary")
@Table(name = "view_riksdagen_party_ballot_support_annual_summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenPartyBallotSupportAnnualSummary
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId embeddedId;
    @XmlElement(name = "disagre_count")
    protected long disagreCount;
    @XmlElement(name = "agree_count")
    protected long agreeCount;
    @XmlElement(name = "disagree_percentage")
    protected long disagreePercentage;
    @XmlElement(name = "total_ballots")
    protected long totalBallots;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "date", column = @Column(name = "EMBEDDED_ID_DATE", length = 255)),
        @AttributeOverride(name = "party", column = @Column(name = "EMBEDDED_ID_PARTY", length = 255)),
        @AttributeOverride(name = "otherParty", column = @Column(name = "EMBEDDED_ID_OTHER_PARTY", length = 255))
    })
    public ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the disagreCount property.
     * 
     */
    @Basic
    @Column(name = "DISAGRE_COUNT", precision = 20, scale = 0)
    public long getDisagreCount() {
        return disagreCount;
    }

    /**
     * Sets the value of the disagreCount property.
     * 
     */
    public void setDisagreCount(long value) {
        this.disagreCount = value;
    }

    /**
     * Gets the value of the agreeCount property.
     * 
     */
    @Basic
    @Column(name = "AGREE_COUNT", precision = 20, scale = 0)
    public long getAgreeCount() {
        return agreeCount;
    }

    /**
     * Sets the value of the agreeCount property.
     * 
     */
    public void setAgreeCount(long value) {
        this.agreeCount = value;
    }

    /**
     * Gets the value of the disagreePercentage property.
     * 
     */
    @Basic
    @Column(name = "DISAGREE_PERCENTAGE", precision = 20, scale = 0)
    public long getDisagreePercentage() {
        return disagreePercentage;
    }

    /**
     * Sets the value of the disagreePercentage property.
     * 
     */
    public void setDisagreePercentage(long value) {
        this.disagreePercentage = value;
    }

    /**
     * Gets the value of the totalBallots property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_BALLOTS", precision = 20, scale = 0)
    public long getTotalBallots() {
        return totalBallots;
    }

    /**
     * Sets the value of the totalBallots property.
     * 
     */
    public void setTotalBallots(long value) {
        this.totalBallots = value;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withEmbeddedId(ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withDisagreCount(long value) {
        setDisagreCount(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withAgreeCount(long value) {
        setAgreeCount(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withDisagreePercentage(long value) {
        setDisagreePercentage(value);
        return this;
    }

    public ViewRiksdagenPartyBallotSupportAnnualSummary withTotalBallots(long value) {
        setTotalBallots(value);
        return this;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId theEmbeddedId;
            theEmbeddedId = this.getEmbeddedId();
            strategy.appendField(locator, this, "embeddedId", buffer, theEmbeddedId);
        }
        {
            long theDisagreCount;
            theDisagreCount = this.getDisagreCount();
            strategy.appendField(locator, this, "disagreCount", buffer, theDisagreCount);
        }
        {
            long theAgreeCount;
            theAgreeCount = this.getAgreeCount();
            strategy.appendField(locator, this, "agreeCount", buffer, theAgreeCount);
        }
        {
            long theDisagreePercentage;
            theDisagreePercentage = this.getDisagreePercentage();
            strategy.appendField(locator, this, "disagreePercentage", buffer, theDisagreePercentage);
        }
        {
            long theTotalBallots;
            theTotalBallots = this.getTotalBallots();
            strategy.appendField(locator, this, "totalBallots", buffer, theTotalBallots);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ViewRiksdagenPartyBallotSupportAnnualSummary that = ((ViewRiksdagenPartyBallotSupportAnnualSummary) object);
        {
            ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId lhsEmbeddedId;
            lhsEmbeddedId = this.getEmbeddedId();
            ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId rhsEmbeddedId;
            rhsEmbeddedId = that.getEmbeddedId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "embeddedId", lhsEmbeddedId), LocatorUtils.property(thatLocator, "embeddedId", rhsEmbeddedId), lhsEmbeddedId, rhsEmbeddedId)) {
                return false;
            }
        }
        {
            long lhsDisagreCount;
            lhsDisagreCount = this.getDisagreCount();
            long rhsDisagreCount;
            rhsDisagreCount = that.getDisagreCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disagreCount", lhsDisagreCount), LocatorUtils.property(thatLocator, "disagreCount", rhsDisagreCount), lhsDisagreCount, rhsDisagreCount)) {
                return false;
            }
        }
        {
            long lhsAgreeCount;
            lhsAgreeCount = this.getAgreeCount();
            long rhsAgreeCount;
            rhsAgreeCount = that.getAgreeCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agreeCount", lhsAgreeCount), LocatorUtils.property(thatLocator, "agreeCount", rhsAgreeCount), lhsAgreeCount, rhsAgreeCount)) {
                return false;
            }
        }
        {
            long lhsDisagreePercentage;
            lhsDisagreePercentage = this.getDisagreePercentage();
            long rhsDisagreePercentage;
            rhsDisagreePercentage = that.getDisagreePercentage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disagreePercentage", lhsDisagreePercentage), LocatorUtils.property(thatLocator, "disagreePercentage", rhsDisagreePercentage), lhsDisagreePercentage, rhsDisagreePercentage)) {
                return false;
            }
        }
        {
            long lhsTotalBallots;
            lhsTotalBallots = this.getTotalBallots();
            long rhsTotalBallots;
            rhsTotalBallots = that.getTotalBallots();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalBallots", lhsTotalBallots), LocatorUtils.property(thatLocator, "totalBallots", rhsTotalBallots), lhsTotalBallots, rhsTotalBallots)) {
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
            ViewRiksdagenPartyBallotSupportAnnualSummaryEmbeddedId theEmbeddedId;
            theEmbeddedId = this.getEmbeddedId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "embeddedId", theEmbeddedId), currentHashCode, theEmbeddedId);
        }
        {
            long theDisagreCount;
            theDisagreCount = this.getDisagreCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disagreCount", theDisagreCount), currentHashCode, theDisagreCount);
        }
        {
            long theAgreeCount;
            theAgreeCount = this.getAgreeCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agreeCount", theAgreeCount), currentHashCode, theAgreeCount);
        }
        {
            long theDisagreePercentage;
            theDisagreePercentage = this.getDisagreePercentage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disagreePercentage", theDisagreePercentage), currentHashCode, theDisagreePercentage);
        }
        {
            long theTotalBallots;
            theTotalBallots = this.getTotalBallots();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalBallots", theTotalBallots), currentHashCode, theTotalBallots);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}