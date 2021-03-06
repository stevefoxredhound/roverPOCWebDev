/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.ConnectGmiVennBothService;
import java.math.BigDecimal;


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
 * Controller object for domain model class ConnectGmiVennBoth.
 * @see com.roverpoc.rovermar01.ConnectGmiVennBoth
 */

@RestController(value = "Rovermar01.ConnectGmiVennBothController")
@Api(value = "/rovermar01/ConnectGmiVennBoth", description = "Exposes APIs to work with ConnectGmiVennBoth resource.")
@RequestMapping("/rovermar01/ConnectGmiVennBoth")
public class ConnectGmiVennBothController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectGmiVennBothController.class);

	@Autowired
	@Qualifier("rovermar01.ConnectGmiVennBothService")
	private ConnectGmiVennBothService connectGmiVennBothService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of ConnectGmiVennBoth instances matching the search criteria.")
	public Page<ConnectGmiVennBoth> findConnectGmiVennBoths( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering ConnectGmiVennBoths list");
		return connectGmiVennBothService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of ConnectGmiVennBoth instances.")
	public Page<ConnectGmiVennBoth> getConnectGmiVennBoths(Pageable pageable) {
		LOGGER.debug("Rendering ConnectGmiVennBoths list");
		return connectGmiVennBothService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of ConnectGmiVennBoth instances.")
	public Long countAllConnectGmiVennBoths() {
		LOGGER.debug("counting ConnectGmiVennBoths");
		Long count = connectGmiVennBothService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the ConnectGmiVennBoth instance associated with the given id.")
    public ConnectGmiVennBoth getConnectGmiVennBoth(@PathVariable("id") BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Getting ConnectGmiVennBoth with id: {}" , id);
        ConnectGmiVennBoth instance = connectGmiVennBothService.findById(id);
        LOGGER.debug("ConnectGmiVennBoth details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the ConnectGmiVennBoth instance associated with the given id.")
    public boolean deleteConnectGmiVennBoth(@PathVariable("id") BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Deleting ConnectGmiVennBoth with id: {}" , id);
        ConnectGmiVennBoth deleted = connectGmiVennBothService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the ConnectGmiVennBoth instance associated with the given id.")
    public ConnectGmiVennBoth editConnectGmiVennBoth(@PathVariable("id") BigDecimal id, @RequestBody ConnectGmiVennBoth instance) throws EntityNotFoundException {
        LOGGER.debug("Editing ConnectGmiVennBoth with id: {}" , instance.getCount_distinct_coreKey__());
        instance.setCount_distinct_coreKey__(id);
        instance = connectGmiVennBothService.update(instance);
        LOGGER.debug("ConnectGmiVennBoth details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new ConnectGmiVennBoth instance.")
	public ConnectGmiVennBoth createConnectGmiVennBoth(@RequestBody ConnectGmiVennBoth instance) {
		LOGGER.debug("Create ConnectGmiVennBoth with information: {}" , instance);
		instance = connectGmiVennBothService.create(instance);
		LOGGER.debug("Created ConnectGmiVennBoth with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setConnectGmiVennBothService(ConnectGmiVennBothService service) {
		this.connectGmiVennBothService = service;
	}
}

