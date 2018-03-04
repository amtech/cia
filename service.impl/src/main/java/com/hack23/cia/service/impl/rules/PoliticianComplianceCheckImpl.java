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

import java.util.List;

import com.hack23.cia.model.internal.application.data.committee.impl.ViewRiksdagenCommitteeBallotDecisionPoliticianSummary;
import com.hack23.cia.model.internal.application.data.committee.impl.ViewRiksdagenVoteDataBallotPoliticianSummary;
import com.hack23.cia.model.internal.application.data.committee.impl.ViewRiksdagenVoteDataBallotPoliticianSummaryAnnual;
import com.hack23.cia.model.internal.application.data.committee.impl.ViewRiksdagenVoteDataBallotPoliticianSummaryDaily;
import com.hack23.cia.model.internal.application.data.committee.impl.ViewRiksdagenVoteDataBallotPoliticianSummaryMonthly;
import com.hack23.cia.model.internal.application.data.document.impl.ViewRiksdagenPoliticianDocument;
import com.hack23.cia.model.internal.application.data.document.impl.ViewRiksdagenPoliticianDocumentDailySummary;
import com.hack23.cia.model.internal.application.data.politician.impl.ViewRiksdagenPolitician;
import com.hack23.cia.service.api.action.kpi.ResourceType;

/**
 * The Class PoliticianComplianceCheckImpl.
 */
public final class PoliticianComplianceCheckImpl extends AbstractComplianceCheckImpl {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The politician. */
	private final ViewRiksdagenPolitician politician;
	
	/** The documents. */
	private List<ViewRiksdagenPoliticianDocument> documents;
	
	/** The document daily summary. */
	private List<ViewRiksdagenPoliticianDocumentDailySummary> documentDailySummary;
	
	/** The ballot decisions. */
	private List<ViewRiksdagenCommitteeBallotDecisionPoliticianSummary> ballotDecisions;
	
	/** The ballots. */
	private List<ViewRiksdagenVoteDataBallotPoliticianSummary> ballots;
	
	/** The daily ballot summary. */
	private List<ViewRiksdagenVoteDataBallotPoliticianSummaryDaily> dailyBallotSummary;
	
	/** The daily summary. */
	private ViewRiksdagenVoteDataBallotPoliticianSummaryDaily dailySummary;
	
	/** The monthly summary. */
	private ViewRiksdagenVoteDataBallotPoliticianSummaryMonthly monthlySummary;
	
	/** The annual summary. */
	private ViewRiksdagenVoteDataBallotPoliticianSummaryAnnual annualSummary;
	
	/** The name. */
	private String name;
	
	/**
	 * Instantiates a new politician compliance check impl.
	 *
	 * @param politician
	 *            the politician
	 */
	public PoliticianComplianceCheckImpl(final ViewRiksdagenPolitician politician,final ViewRiksdagenVoteDataBallotPoliticianSummaryDaily dailySummary, final ViewRiksdagenVoteDataBallotPoliticianSummaryMonthly monthlySummary,final ViewRiksdagenVoteDataBallotPoliticianSummaryAnnual annualSummary) {
		super(ResourceType.POLITICIAN);
		this.politician = politician;
		this.dailySummary = dailySummary;
		this.monthlySummary = monthlySummary;
		this.annualSummary = annualSummary;
		this.name = politician.getFirstName() + " " + politician.getLastName() + " (" +politician.getParty() +")";
	}

	/**
	 * Gets the politician.
	 *
	 * @return the politician
	 */
	public ViewRiksdagenPolitician getPolitician() {
		return politician;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getId() {
		return politician.getPersonId();
	}

	/**
	 * Gets the documents.
	 *
	 * @return the documents
	 */
	public List<ViewRiksdagenPoliticianDocument> getDocuments() {
		return documents;
	}

	/**
	 * Sets the documents.
	 *
	 * @param documents
	 *            the new documents
	 */
	public void setDocuments(List<ViewRiksdagenPoliticianDocument> documents) {
		this.documents = documents;
	}

	/**
	 * Gets the document daily summary.
	 *
	 * @return the document daily summary
	 */
	public List<ViewRiksdagenPoliticianDocumentDailySummary> getDocumentDailySummary() {
		return documentDailySummary;
	}

	/**
	 * Sets the document daily summary.
	 *
	 * @param documentDailySummary
	 *            the new document daily summary
	 */
	public void setDocumentDailySummary(List<ViewRiksdagenPoliticianDocumentDailySummary> documentDailySummary) {
		this.documentDailySummary = documentDailySummary;
	}

	/**
	 * Gets the ballot decisions.
	 *
	 * @return the ballot decisions
	 */
	public List<ViewRiksdagenCommitteeBallotDecisionPoliticianSummary> getBallotDecisions() {
		return ballotDecisions;
	}

	/**
	 * Sets the ballot decisions.
	 *
	 * @param ballotDecisions
	 *            the new ballot decisions
	 */
	public void setBallotDecisions(List<ViewRiksdagenCommitteeBallotDecisionPoliticianSummary> ballotDecisions) {
		this.ballotDecisions = ballotDecisions;
	}

	/**
	 * Gets the ballots.
	 *
	 * @return the ballots
	 */
	public List<ViewRiksdagenVoteDataBallotPoliticianSummary> getBallots() {
		return ballots;
	}

	/**
	 * Sets the ballots.
	 *
	 * @param ballots
	 *            the new ballots
	 */
	public void setBallots(List<ViewRiksdagenVoteDataBallotPoliticianSummary> ballots) {
		this.ballots = ballots;
	}

	/**
	 * Gets the daily ballot summary.
	 *
	 * @return the daily ballot summary
	 */
	public List<ViewRiksdagenVoteDataBallotPoliticianSummaryDaily> getDailyBallotSummary() {
		return dailyBallotSummary;
	}

	/**
	 * Sets the daily ballot summary.
	 *
	 * @param dailyBallotSummary
	 *            the new daily ballot summary
	 */
	public void setDailyBallotSummary(List<ViewRiksdagenVoteDataBallotPoliticianSummaryDaily> dailyBallotSummary) {
		this.dailyBallotSummary = dailyBallotSummary;
	}

	/**
	 * Gets the daily summary.
	 *
	 * @return the daily summary
	 */
	public ViewRiksdagenVoteDataBallotPoliticianSummaryDaily getDailySummary() {
		return dailySummary;
	}

	/**
	 * Sets the daily summary.
	 *
	 * @param dailySummary
	 *            the new daily summary
	 */
	public void setDailySummary(ViewRiksdagenVoteDataBallotPoliticianSummaryDaily dailySummary) {
		this.dailySummary = dailySummary;
	}

	/**
	 * Gets the monthly summary.
	 *
	 * @return the monthly summary
	 */
	public ViewRiksdagenVoteDataBallotPoliticianSummaryMonthly getMonthlySummary() {
		return monthlySummary;
	}

	/**
	 * Sets the monthly summary.
	 *
	 * @param monthlySummary
	 *            the new monthly summary
	 */
	public void setMonthlySummary(ViewRiksdagenVoteDataBallotPoliticianSummaryMonthly monthlySummary) {
		this.monthlySummary = monthlySummary;
	}

	/**
	 * Gets the annual summary.
	 *
	 * @return the annual summary
	 */
	public ViewRiksdagenVoteDataBallotPoliticianSummaryAnnual getAnnualSummary() {
		return annualSummary;
	}

	/**
	 * Sets the annual summary.
	 *
	 * @param annualSummary
	 *            the new annual summary
	 */
	public void setAnnualSummary(ViewRiksdagenVoteDataBallotPoliticianSummaryAnnual annualSummary) {
		this.annualSummary = annualSummary;
	}
	
}