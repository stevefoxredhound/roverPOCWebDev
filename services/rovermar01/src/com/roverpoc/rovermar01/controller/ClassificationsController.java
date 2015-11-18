/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.ClassificationsService;


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
 * Controller object for domain model class Classifications.
 * @see com.roverpoc.rovermar01.Classifications
 */

@RestController(value = "Rovermar01.ClassificationsController")
@Api(value = "/rovermar01/Classifications", description = "Exposes APIs to work with Classifications resource.")
@RequestMapping("/rovermar01/Classifications")
public class ClassificationsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassificationsController.class);

	@Autowired
	@Qualifier("rovermar01.ClassificationsService")
	private ClassificationsService classificationsService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Classifications instances matching the search criteria.")
	public Page<Classifications> findClassificationss( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Classificationss list");
		return classificationsService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Classifications instances.")
	public Page<Classifications> getClassificationss(Pageable pageable) {
		LOGGER.debug("Rendering Classificationss list");
		return classificationsService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Classifications instances.")
	public Long countAllClassificationss() {
		LOGGER.debug("counting Classificationss");
		Long count = classificationsService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Classifications instance associated with the given id.")
    public Classifications getClassifications(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Classifications with id: {}" , id);
        Classifications instance = classificationsService.findById(id);
        LOGGER.debug("Classifications details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Classifications instance associated with the given id.")
    public boolean deleteClassifications(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Classifications with id: {}" , id);
        Classifications deleted = classificationsService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Classifications instance associated with the given id.")
    public Classifications editClassifications(@PathVariable("id") Integer id, @RequestBody Classifications instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Classifications with id: {}" , instance.getId());
        instance.setId(id);
        instance = classificationsService.update(instance);
        LOGGER.debug("Classifications details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Classifications instance.")
	public Classifications createClassifications(@RequestBody Classifications instance) {
		LOGGER.debug("Create Classifications with information: {}" , instance);
		instance = classificationsService.create(instance);
		LOGGER.debug("Created Classifications with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setClassificationsService(ClassificationsService service) {
		this.classificationsService = service;
	}
}

