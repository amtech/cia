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
package com.hack23.cia.service.impl.rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.service.api.action.kpi.ComplianceCheck;
import com.hack23.cia.service.api.action.kpi.ResourceType;
import com.hack23.cia.service.api.action.kpi.RuleViolation;
import com.hack23.cia.service.api.action.kpi.Status;

/**
 * The Class AbstractComplianceCheckImpl.
 */
public abstract class AbstractComplianceCheckImpl implements ComplianceCheck {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The resource type. */
	private final ResourceType resourceType;
			
	/** The rule violation map. */
	private Map<String,RuleViolation> ruleViolationMap = new HashMap<>();
	
	/**
	 * Instantiates a new abstract compliance check impl.
	 *
	 * @param resourceType
	 *            the resource type
	 */
	public AbstractComplianceCheckImpl(final ResourceType resourceType) {
		super();
		this.resourceType = resourceType;
	}


	/**
	 * Gets the resource type.
	 *
	 * @return the resource type
	 */
	@Override
	public ResourceType getResourceType() {
		return resourceType;
	}
	
	/**
	 * Gets the rule violations.
	 *
	 * @return the rule violations
	 */
	@Override
	public final List<RuleViolation> getRuleViolations() {
		return new ArrayList<RuleViolation>(ruleViolationMap.values());
	}

	/**
	 * Gets the number rule violations.
	 *
	 * @return the number rule violations
	 */
	@Override
	public int getNumberRuleViolations() {
		return ruleViolationMap.values().size();
	}
	
	/**
	 * Gets the rule summary.
	 *
	 * @return the rule summary
	 */
	@Override
	public final String getRuleSummary() {
		Collection<RuleViolation> values = ruleViolationMap.values();
		StringBuilder builder = new StringBuilder();
		for (RuleViolation ruleViolation : values) {
			builder.append("[").append(ruleViolation.getRuleName()).append("/").append(ruleViolation.getStatus()) .append("]");
		}		
		return builder.toString();
	}
	
	/**
	 * Adds the violation.
	 *
	 * @param status
	 *            the status
	 * @param ruleName
	 *            the rule name
	 * @param ruleGroup
	 *            the rule group
	 * @param ruleDescription
	 *            the rule description
	 */
	public final void addViolation(final Status status,final String ruleName,final String ruleGroup,final String ruleDescription) {		
		ruleViolationMap.put(ruleName, new RuleViolation(getId(),getName(),resourceType,ruleName,ruleDescription,ruleGroup,status));
	}

	@Override
	public final boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}