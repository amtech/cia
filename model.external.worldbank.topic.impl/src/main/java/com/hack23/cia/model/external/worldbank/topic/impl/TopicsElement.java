//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:45 PM CET 
//


package com.hack23.cia.model.external.worldbank.topic.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://topic.worldbank.external.model.cia.hack23.com/impl}topic" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="per_page" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topic"
})
@XmlRootElement(name = "topics")
@Entity(name = "TopicsElement")
@Table(name = "TOPICS_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class TopicsElement
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<TopicElement> topic;
    @XmlAttribute(name = "page")
    protected BigInteger page;
    @XmlAttribute(name = "pages")
    protected BigInteger pages;
    @XmlAttribute(name = "per_page")
    protected BigInteger perPage;
    @XmlAttribute(name = "total")
    protected BigInteger total;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the topic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicElement }
     * 
     * 
     */
    @OneToMany(targetEntity = TopicElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TOPIC_TOPICS_ELEMENT_HJID")
    public List<TopicElement> getTopic() {
        if (topic == null) {
            topic = new ArrayList<TopicElement>();
        }
        return this.topic;
    }

    /**
     * 
     * 
     */
    public void setTopic(List<TopicElement> topic) {
        this.topic = topic;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PAGE", precision = 20, scale = 0)
    public BigInteger getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPage(BigInteger value) {
        this.page = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PAGES", precision = 20, scale = 0)
    public BigInteger getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPages(BigInteger value) {
        this.pages = value;
    }

    /**
     * Gets the value of the perPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PER_PAGE", precision = 20, scale = 0)
    public BigInteger getPerPage() {
        return perPage;
    }

    /**
     * Sets the value of the perPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPerPage(BigInteger value) {
        this.perPage = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "TOTAL", precision = 20, scale = 0)
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    public TopicsElement withTopic(TopicElement... values) {
        if (values!= null) {
            for (TopicElement value: values) {
                getTopic().add(value);
            }
        }
        return this;
    }

    public TopicsElement withTopic(Collection<TopicElement> values) {
        if (values!= null) {
            getTopic().addAll(values);
        }
        return this;
    }

    public TopicsElement withTopic(List<TopicElement> topic) {
        setTopic(topic);
        return this;
    }

    public TopicsElement withPage(BigInteger value) {
        setPage(value);
        return this;
    }

    public TopicsElement withPages(BigInteger value) {
        setPages(value);
        return this;
    }

    public TopicsElement withPerPage(BigInteger value) {
        setPerPage(value);
        return this;
    }

    public TopicsElement withTotal(BigInteger value) {
        setTotal(value);
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
            List<TopicElement> theTopic;
            theTopic = (((this.topic!= null)&&(!this.topic.isEmpty()))?this.getTopic():null);
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            BigInteger thePage;
            thePage = this.getPage();
            strategy.appendField(locator, this, "page", buffer, thePage);
        }
        {
            BigInteger thePages;
            thePages = this.getPages();
            strategy.appendField(locator, this, "pages", buffer, thePages);
        }
        {
            BigInteger thePerPage;
            thePerPage = this.getPerPage();
            strategy.appendField(locator, this, "perPage", buffer, thePerPage);
        }
        {
            BigInteger theTotal;
            theTotal = this.getTotal();
            strategy.appendField(locator, this, "total", buffer, theTotal);
        }
        return buffer;
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
        final TopicsElement that = ((TopicsElement) object);
        {
            List<TopicElement> lhsTopic;
            lhsTopic = (((this.topic!= null)&&(!this.topic.isEmpty()))?this.getTopic():null);
            List<TopicElement> rhsTopic;
            rhsTopic = (((that.topic!= null)&&(!that.topic.isEmpty()))?that.getTopic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            BigInteger lhsPage;
            lhsPage = this.getPage();
            BigInteger rhsPage;
            rhsPage = that.getPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "page", lhsPage), LocatorUtils.property(thatLocator, "page", rhsPage), lhsPage, rhsPage)) {
                return false;
            }
        }
        {
            BigInteger lhsPages;
            lhsPages = this.getPages();
            BigInteger rhsPages;
            rhsPages = that.getPages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pages", lhsPages), LocatorUtils.property(thatLocator, "pages", rhsPages), lhsPages, rhsPages)) {
                return false;
            }
        }
        {
            BigInteger lhsPerPage;
            lhsPerPage = this.getPerPage();
            BigInteger rhsPerPage;
            rhsPerPage = that.getPerPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perPage", lhsPerPage), LocatorUtils.property(thatLocator, "perPage", rhsPerPage), lhsPerPage, rhsPerPage)) {
                return false;
            }
        }
        {
            BigInteger lhsTotal;
            lhsTotal = this.getTotal();
            BigInteger rhsTotal;
            rhsTotal = that.getTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
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
            List<TopicElement> theTopic;
            theTopic = (((this.topic!= null)&&(!this.topic.isEmpty()))?this.getTopic():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            BigInteger thePage;
            thePage = this.getPage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "page", thePage), currentHashCode, thePage);
        }
        {
            BigInteger thePages;
            thePages = this.getPages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pages", thePages), currentHashCode, thePages);
        }
        {
            BigInteger thePerPage;
            thePerPage = this.getPerPage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perPage", thePerPage), currentHashCode, thePerPage);
        }
        {
            BigInteger theTotal;
            theTotal = this.getTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "total", theTotal), currentHashCode, theTotal);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}