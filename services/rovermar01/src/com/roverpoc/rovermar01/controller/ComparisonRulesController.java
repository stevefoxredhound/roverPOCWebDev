/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.ComparisonRulesService;


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
 * Controller object for domain model class ComparisonRules.
 * @see com.roverpoc.rovermar01.ComparisonRules
 */

@RestController(value = "Rovermar01.ComparisonRulesController")
@Api(value = "/rovermar01/ComparisonRules", description = "Exposes APIs to work with ComparisonRules resource.")
@RequestMapping("/rovermar01/ComparisonRules")
public class ComparisonRulesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonRulesController.class);

	@Autowired
	@Qualifier("rovermar01.ComparisonRulesService")
	private ComparisonRulesService comparisonRulesService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of ComparisonRules instances matching the search criteria.")
	public Page<ComparisonRules> findComparisonRuless( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering ComparisonRuless list");
		return comparisonRulesService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of ComparisonRules instances.")
	public Page<ComparisonRules> getComparisonRuless(Pageable pageable) {
		LOGGER.debug("Rendering ComparisonRuless list");
		return comparisonRulesService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of ComparisonRules instances.")
	public Long countAllComparisonRuless() {
		LOGGER.debug("counting ComparisonRuless");
		Long count = comparisonRulesService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the ComparisonRules instance associated with the given id.")
    public ComparisonRules getComparisonRules(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting ComparisonRules with id: {}" , id);
        ComparisonRules instance = comparisonRulesService.findById(id);
        LOGGER.debug("ComparisonRules details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the ComparisonRules instance associated with the given id.")
    public boolean deleteComparisonRules(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting ComparisonRules with id: {}" , id);
        ComparisonRules deleted = comparisonRulesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the ComparisonRules instance associated with the given id.")
    public ComparisonRules editComparisonRules(@PathVariable("id") Integer id, @RequestBody ComparisonRules instance) throws EntityNotFoundException {
        LOGGER.debug("Editing ComparisonRules with id: {}" , instance.getId());
        instance.setId(id);
        instance = comparisonRulesService.update(instance);
        LOGGER.debug("ComparisonRules details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new ComparisonRules instance.")
	public ComparisonRules createComparisonRules(@RequestBody ComparisonRules instance) {
		LOGGER.debug("Create ComparisonRules with information: {}" , instance);
		instance = comparisonRulesService.create(instance);
		LOGGER.debug("Created ComparisonRules with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setComparisonRulesService(ComparisonRulesService service) {
		this.comparisonRulesService = service;
	}
}
