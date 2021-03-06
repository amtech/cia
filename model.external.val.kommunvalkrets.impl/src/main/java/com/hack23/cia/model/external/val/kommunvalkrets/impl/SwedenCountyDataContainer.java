/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:54 PM CET 
//


package com.hack23.cia.model.external.val.kommunvalkrets.impl;

import java.util.ArrayList;
import java.util.List;

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
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class SwedenCountyDataContainer.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenCountyDataContainer", propOrder = {
    "countyRegions"
})
@Entity(name = "SwedenCountyDataContainer")
@Table(name = "SWEDEN_COUNTY_DATA_CONTAINER")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenCountyDataContainer
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The county regions. */
    @XmlElement(name = "l\u00e4n", required = true)
    protected List<SwedenCountyData> countyRegions;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the county regions.
	 *
	 * @return the county regions
	 */
    @OneToMany(targetEntity = SwedenCountyData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COUNTY_REGIONS_SWEDEN_COUNTY_0")
    public List<SwedenCountyData> getCountyRegions() {
        if (countyRegions == null) {
            countyRegions = new ArrayList<>();
        }
        return this.countyRegions;
    }

    /**
	 * Sets the county regions.
	 *
	 * @param countyRegions the new county regions
	 */
    public void setCountyRegions(final List<SwedenCountyData> countyRegions) {
        this.countyRegions = countyRegions;
    }

    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

    /* (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SwedenCountyDataContainer that = ((SwedenCountyDataContainer) object);
        {
            List<SwedenCountyData> lhsCountyRegions;
            lhsCountyRegions = (((this.countyRegions!= null)&&(!this.countyRegions.isEmpty()))?this.getCountyRegions():null);
            List<SwedenCountyData> rhsCountyRegions;
            rhsCountyRegions = (((that.countyRegions!= null)&&(!that.countyRegions.isEmpty()))?that.getCountyRegions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countyRegions", lhsCountyRegions), LocatorUtils.property(thatLocator, "countyRegions", rhsCountyRegions), lhsCountyRegions, rhsCountyRegions)) {
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
