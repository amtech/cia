/*
 * Copyright 2014 James Pether Sörling
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
package com.hack23.cia.web.impl.ui.application.views.user.committee.pagemode;

import org.apache.commons.lang3.StringUtils;
import org.dussan.vaadin.dcharts.DCharts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import com.hack23.cia.model.internal.application.data.committee.impl.ViewRiksdagenCommittee;
import com.hack23.cia.model.internal.application.system.impl.ApplicationEventGroup;
import com.hack23.cia.service.api.DataContainer;
import com.hack23.cia.web.impl.ui.application.action.ViewAction;
import com.hack23.cia.web.impl.ui.application.views.common.chartfactory.DocumentChartDataManager;
import com.hack23.cia.web.impl.ui.application.views.common.labelfactory.LabelFactory;
import com.hack23.cia.web.impl.ui.application.views.common.sizing.ContentRatio;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.CommitteePageMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * The Class CommitteeDocumentActivityPageModContentFactoryImpl.
 */
@Component
public final class CommitteeDocumentActivityPageModContentFactoryImpl extends AbstractCommitteePageModContentFactoryImpl {

	/** The Constant COMMITTEE. */
	private static final String COMMITTEE = "Committee:";

	/** The Constant DOCUMENT_ACTIVITY. */
	private static final String DOCUMENT_ACTIVITY = "Document Activity";

	/** The chart data manager. */
	@Autowired
	private DocumentChartDataManager chartDataManager;


	/**
	 * Instantiates a new committee document activity page mod content factory
	 * impl.
	 */
	public CommitteeDocumentActivityPageModContentFactoryImpl() {
		super();
	}

	@Override
	public boolean matches(final String page, final String parameters) {
		return NAME.equals(page) && (!StringUtils.isEmpty(parameters) && parameters.contains(CommitteePageMode.DOCUMENTACTIVITY.toString()));
	}

	@Secured({ "ROLE_ANONYMOUS", "ROLE_USER", "ROLE_ADMIN" })
	@Override
	public Layout createContent(final String parameters, final MenuBar menuBar, final Panel panel) {
		final VerticalLayout panelContent = createPanelContent();

		final String pageId = getPageId(parameters);


		final DataContainer<ViewRiksdagenCommittee, String> dataContainer = getApplicationManager()
				.getDataContainer(ViewRiksdagenCommittee.class);

		final ViewRiksdagenCommittee viewRiksdagenCommittee = dataContainer.load(pageId);

		if (viewRiksdagenCommittee != null) {

				getMenuItemFactory().createCommitteeeMenuBar(menuBar, pageId);

				final Label createHeader2Label = LabelFactory.createHeader2Label(DOCUMENT_ACTIVITY);
				panelContent.addComponent(createHeader2Label);


				final DCharts createDocumentHistoryChart = chartDataManager
						.createDocumentHistoryChartByOrg(viewRiksdagenCommittee.getEmbeddedId().getOrgCode());

				panelContent.addComponent(createDocumentHistoryChart);

				panelContent.setExpandRatio(createHeader2Label,ContentRatio.SMALL);
				panelContent.setExpandRatio(createDocumentHistoryChart, ContentRatio.GRID);


				panel.setCaption(COMMITTEE + viewRiksdagenCommittee.getEmbeddedId().getDetail());
				getPageActionEventHelper().createPageEvent(ViewAction.VISIT_COMMITTEE_VIEW, ApplicationEventGroup.USER, NAME, parameters, pageId);
		}
		return panelContent;

	}


}
