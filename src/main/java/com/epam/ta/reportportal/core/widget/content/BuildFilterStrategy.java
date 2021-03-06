/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-api
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.core.widget.content;

import com.epam.ta.reportportal.database.entity.filter.UserFilter;
import com.epam.ta.reportportal.database.entity.widget.ContentOptions;

import java.util.Map;

/**
 * Strategy definition interface for building widget specific filters
 *
 * @author Dzmitry_Kavalets
 */
public interface BuildFilterStrategy {

	String LAST_FOUND_LAUNCH = "lastLaunch";
	int RESULTED_MAP_SIZE = 2;
	int ITEMS_COUNT_VALUE = 20;
	String LAUNCH_NAME_FIELD = "launchNameFilter";
	String INCLUDE_METHODS = "include_methods";

	/**
	 * Get widget content with predefined filter in accordance with used
	 * strategy
	 *
	 * @param userFilter
	 * @param contentOptions
	 * @param projectName
	 * @return
	 */
	Map<String, ?> buildFilterAndLoadContent(UserFilter userFilter, ContentOptions contentOptions, String projectName);

}