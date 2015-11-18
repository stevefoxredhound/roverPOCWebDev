/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.OperatorsService;


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
 * Controller object for domain model class Operators.
 * @see com.roverpoc.rovermar01.Operators
 */

@RestController(value = "Rovermar01.OperatorsController")
@Api(value = "/rovermar01/Operators", description = "Exposes APIs to work with Operators resource.")
@RequestMapping("/rovermar01/Operators")
public class OperatorsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperatorsController.class);

	@Autowired
	@Qualifier("rovermar01.OperatorsService")
	private OperatorsService operatorsService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Operators instances matching the search criteria.")
	public Page<Operators> findOperatorss( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Operatorss list");
		return operatorsService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Operators instances.")
	public Page<Operators> getOperatorss(Pageable pageable) {
		LOGGER.debug("Rendering Operatorss list");
		return operatorsService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Operators instances.")
	public Long countAllOperatorss() {
		LOGGER.debug("counting Operatorss");
		Long count = operatorsService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Operators instance associated with the given id.")
    public Operators getOperators(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Operators with id: {}" , id);
        Operators instance = operatorsService.findById(id);
        LOGGER.debug("Operators details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Operators instance associated with the given id.")
    public boolean deleteOperators(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Operators with id: {}" , id);
        Operators deleted = operatorsService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Operators instance associated with the given id.")
    public Operators editOperators(@PathVariable("id") Integer id, @RequestBody Operators instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Operators with id: {}" , instance.getId());
        instance.setId(id);
        instance = operatorsService.update(instance);
        LOGGER.debug("Operators details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Operators instance.")
	public Operators createOperators(@RequestBody Operators instance) {
		LOGGER.debug("Create Operators with information: {}" , instance);
		instance = operatorsService.create(instance);
		LOGGER.debug("Created Operators with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setOperatorsService(OperatorsService service) {
		this.operatorsService = service;
	}
}

