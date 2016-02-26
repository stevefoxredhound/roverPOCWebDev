/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.TestNcliteProdMessagesService;


import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;

import com.roverpoc.rovermar01.*;
import com.roverpoc.rovermar01.service.*;


/**
 * Controller object for domain model class TestNcliteProdMessages.
 * @see com.roverpoc.rovermar01.TestNcliteProdMessages
 */

@RestController(value = "Rovermar01.TestNcliteProdMessagesController")
@Api(value = "/rovermar01/TestNcliteProdMessages", description = "Exposes APIs to work with TestNcliteProdMessages resource.")
@RequestMapping("/rovermar01/TestNcliteProdMessages")
public class TestNcliteProdMessagesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestNcliteProdMessagesController.class);

	@Autowired
	@Qualifier("rovermar01.TestNcliteProdMessagesService")
	private TestNcliteProdMessagesService testNcliteProdMessagesService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of TestNcliteProdMessages instances matching the search criteria.")
	public Page<TestNcliteProdMessages> findTestNcliteProdMessagess( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering TestNcliteProdMessagess list");
		return testNcliteProdMessagesService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of TestNcliteProdMessages instances.")
	public Page<TestNcliteProdMessages> getTestNcliteProdMessagess(Pageable pageable) {
		LOGGER.debug("Rendering TestNcliteProdMessagess list");
		return testNcliteProdMessagesService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of TestNcliteProdMessages instances.")
	public Long countAllTestNcliteProdMessagess() {
		LOGGER.debug("counting TestNcliteProdMessagess");
		Long count = testNcliteProdMessagesService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the TestNcliteProdMessages instance associated with the given id.")
    public TestNcliteProdMessages getTestNcliteProdMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting TestNcliteProdMessages with id: {}" , id);
        TestNcliteProdMessages instance = testNcliteProdMessagesService.findById(id);
        LOGGER.debug("TestNcliteProdMessages details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the TestNcliteProdMessages instance associated with the given id.")
    public boolean deleteTestNcliteProdMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting TestNcliteProdMessages with id: {}" , id);
        TestNcliteProdMessages deleted = testNcliteProdMessagesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the TestNcliteProdMessages instance associated with the given id.")
    public TestNcliteProdMessages editTestNcliteProdMessages(@PathVariable("id") Integer id, @RequestBody TestNcliteProdMessages instance) throws EntityNotFoundException {
        LOGGER.debug("Editing TestNcliteProdMessages with id: {}" , instance.getId());
        instance.setId(id);
        instance = testNcliteProdMessagesService.update(instance);
        LOGGER.debug("TestNcliteProdMessages details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new TestNcliteProdMessages instance.")
	public TestNcliteProdMessages createTestNcliteProdMessages(@RequestBody TestNcliteProdMessages instance) {
		LOGGER.debug("Create TestNcliteProdMessages with information: {}" , instance);
		instance = testNcliteProdMessagesService.create(instance);
		LOGGER.debug("Created TestNcliteProdMessages with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setTestNcliteProdMessagesService(TestNcliteProdMessagesService service) {
		this.testNcliteProdMessagesService = service;
	}
}
