/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.SysAProdMessagesService;


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
 * Controller object for domain model class SysAProdMessages.
 * @see com.roverpoc.rovermar01.SysAProdMessages
 */

@RestController(value = "Rovermar01.SysAProdMessagesController")
@Api(value = "/rovermar01/SysAProdMessages", description = "Exposes APIs to work with SysAProdMessages resource.")
@RequestMapping("/rovermar01/SysAProdMessages")
public class SysAProdMessagesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysAProdMessagesController.class);

	@Autowired
	@Qualifier("rovermar01.SysAProdMessagesService")
	private SysAProdMessagesService sysAProdMessagesService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of SysAProdMessages instances matching the search criteria.")
	public Page<SysAProdMessages> findSysAProdMessagess( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering SysAProdMessagess list");
		return sysAProdMessagesService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of SysAProdMessages instances.")
	public Page<SysAProdMessages> getSysAProdMessagess(Pageable pageable) {
		LOGGER.debug("Rendering SysAProdMessagess list");
		return sysAProdMessagesService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of SysAProdMessages instances.")
	public Long countAllSysAProdMessagess() {
		LOGGER.debug("counting SysAProdMessagess");
		Long count = sysAProdMessagesService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the SysAProdMessages instance associated with the given id.")
    public SysAProdMessages getSysAProdMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting SysAProdMessages with id: {}" , id);
        SysAProdMessages instance = sysAProdMessagesService.findById(id);
        LOGGER.debug("SysAProdMessages details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the SysAProdMessages instance associated with the given id.")
    public boolean deleteSysAProdMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting SysAProdMessages with id: {}" , id);
        SysAProdMessages deleted = sysAProdMessagesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the SysAProdMessages instance associated with the given id.")
    public SysAProdMessages editSysAProdMessages(@PathVariable("id") Integer id, @RequestBody SysAProdMessages instance) throws EntityNotFoundException {
        LOGGER.debug("Editing SysAProdMessages with id: {}" , instance.getId());
        instance.setId(id);
        instance = sysAProdMessagesService.update(instance);
        LOGGER.debug("SysAProdMessages details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new SysAProdMessages instance.")
	public SysAProdMessages createSysAProdMessages(@RequestBody SysAProdMessages instance) {
		LOGGER.debug("Create SysAProdMessages with information: {}" , instance);
		instance = sysAProdMessagesService.create(instance);
		LOGGER.debug("Created SysAProdMessages with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setSysAProdMessagesService(SysAProdMessagesService service) {
		this.sysAProdMessagesService = service;
	}
}

