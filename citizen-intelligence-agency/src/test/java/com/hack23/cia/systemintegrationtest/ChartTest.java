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
package com.hack23.cia.systemintegrationtest;

import java.util.Map;
import java.util.Map.Entry;

import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.base.elements.XYseries;
import org.dussan.vaadin.dcharts.helpers.ClassHelper;
import org.dussan.vaadin.dcharts.helpers.ObjectHelper;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.junit.Assert;
import org.junit.Test;

public class ChartTest extends Assert {

	/**
	 * Adds the serie test.
	 */
	@Test
	public void addSerieTest() {
		final XYseries label = new XYseriesFix();
		label.setLabel("sune");
		toJsonString(label);
		assertNotNull("Problem with toJsonString, no label",label);
	}

	static class XYseriesFix extends XYseries {

		/* (non-Javadoc)
		 * @see org.dussan.vaadin.dcharts.base.elements.XYseries#getValue()
		 */
		@Override
		public String getValue() {
			return toJsonString(this);
		}

	}

	static class XYaxisFix extends XYaxis {

		/**
		 * Instantiates a new x yaxis fix.
		 */
		public XYaxisFix() {
			super();
		}

		/**
		 * Instantiates a new x yaxis fix.
		 *
		 * @param y
		 *            the y
		 */
		public XYaxisFix(XYaxes y) {
			super(y);
		}

		/* (non-Javadoc)
		 * @see org.dussan.vaadin.dcharts.base.elements.XYaxis#getValue()
		 */
		@Override
		public String getValue() {
			return toJsonString(this);
		}

	}


	/**
	 * To json string.
	 *
	 * @param object
	 *            the object
	 * @return the string
	 */
	public static String toJsonString(Object object) {
		try {
			Map<String, Object> values = ClassHelper.getFieldValues(object);
			StringBuilder builder = new StringBuilder();
			for (Entry<String, Object> entry : values.entrySet()) {
				String fieldName = entry.getKey();
				Object fieldValue = entry.getValue();

				if (!fieldName.contains("jacocoData")) {
				if (ObjectHelper.isArray(fieldValue)) {

					if (fieldValue instanceof Object[][]) {
						fieldValue = ObjectHelper
								.toArrayString((Object[][]) fieldValue);
					} else if (fieldValue instanceof boolean[]) {

					} else

					{
						fieldValue = ObjectHelper
								.toArrayString((Object[]) fieldValue);
					}
				}

				if (fieldValue != null) {
					fieldValue = !ObjectHelper.isString(fieldValue) ? fieldValue
							: fieldValue.toString().replaceAll("\"", "'");
					builder.append(builder.length() > 0 ? ", " : "");
					builder.append(fieldName + ": ");
					builder.append(ObjectHelper.isString(fieldValue) ? "\""
							: "");
					builder.append(fieldValue);
					builder.append(ObjectHelper.isString(fieldValue) ? "\""
							: "");
				}
				}
			}
			return builder.insert(0, "{").append("}").toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
