/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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

package com.epam.ta.reportportal.database.triggers;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epam.ta.BaseTest;
import com.epam.ta.reportportal.database.dao.LaunchRepository;
import com.epam.ta.reportportal.database.dao.TestItemRepository;
import com.epam.ta.reportportal.database.entity.Launch;
import com.epam.ta.reportportal.database.fixture.SpringFixture;
import com.epam.ta.reportportal.database.fixture.SpringFixtureRule;

@SpringFixture("aspectTriggersTests")
public class DeleteLaunchTriggerTest extends BaseTest {
	private static final String LAUNCH_ID = "88624678053de743b3e5aa9e";

	@Rule
	@Autowired
	public SpringFixtureRule dfRule;

	@Autowired
	private LaunchRepository launchRepository;

	@Autowired
	private TestItemRepository testItemRepository;

	@Test
	public void testDeleteAsObject() {
		Launch launch = launchRepository.findOne(LAUNCH_ID);
		launchRepository.delete(launch);
		Assert.assertNull(launchRepository.findOne(LAUNCH_ID));
		Assert.assertTrue(testItemRepository.findIdsByLaunch(LAUNCH_ID).isEmpty());
	}

	@Test
	public void testDeleteAsId() {
		launchRepository.delete(LAUNCH_ID);
		Assert.assertNull(launchRepository.findOne(LAUNCH_ID));
		Assert.assertTrue(testItemRepository.findIdsByLaunch(LAUNCH_ID).isEmpty());
	}

	@Test
	public void testDeleteByAsList() {
		Launch launch = launchRepository.findOne(LAUNCH_ID);
		launchRepository.delete(Collections.singleton(launch));
		Assert.assertNull(launchRepository.findOne(LAUNCH_ID));
		Assert.assertTrue(testItemRepository.findIdsByLaunch(LAUNCH_ID).isEmpty());
	}
}