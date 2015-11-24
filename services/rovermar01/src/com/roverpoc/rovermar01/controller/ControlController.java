/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.ControlService;


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
import com.wordnik.swagger.annotations.*;

import com.roverpoc.rovermar01.*;
import com.roverpoc.rovermar01.service.*;


/**
 * Controller object for domain model class Control.
 * @see com.roverpoc.rovermar01.Control
 */

@RestController(value = "Rovermar01.ControlController")
@Api(value = "/rovermar01/Control", description = "Exposes APIs to work with Control resource.")
@RequestMapping("/rovermar01/Control")
public class ControlController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControlController.class);

	@Autowired
	@Qualifier("rovermar01.ControlService")
	private ControlService controlService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Control instances matching the search criteria.")
	public Page<Control> findControls( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Controls list");
		return controlService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Control instances.")
	public Page<Control> getControls(Pageable pageable) {
		LOGGER.debug("Rendering Controls list");
		return controlService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Control instances.")
	public Long countAllControls() {
		LOGGER.debug("counting Controls");
		Long count = controlService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Control instance associated with the given id.")
    public Control getControl(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Control with id: {}" , id);
        Control instance = controlService.findById(id);
        LOGGER.debug("Control details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Control instance associated with the given id.")
    public boolean deleteControl(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Control with id: {}" , id);
        Control deleted = controlService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Control instance associated with the given id.")
    public Control editControl(@PathVariable("id") Integer id, @RequestBody Control instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Control with id: {}" , instance.getId());
        instance.setId(id);
        instance = controlService.update(instance);
        LOGGER.debug("Control details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Control instance.")
	public Control createControl(@RequestBody Control instance) {
		LOGGER.debug("Create Control with information: {}" , instance);
		instance = controlService.create(instance);
		LOGGER.debug("Created Control with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setControlService(ControlService service) {
		this.controlService = service;
	}
}
