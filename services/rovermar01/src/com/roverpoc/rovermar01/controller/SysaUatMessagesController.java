/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rovermar01.service.SysaUatMessagesService;


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
 * Controller object for domain model class SysaUatMessages.
 * @see com.roverpoc.rovermar01.SysaUatMessages
 */

@RestController(value = "Rovermar01.SysaUatMessagesController")
@Api(value = "/rovermar01/SysaUatMessages", description = "Exposes APIs to work with SysaUatMessages resource.")
@RequestMapping("/rovermar01/SysaUatMessages")
public class SysaUatMessagesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysaUatMessagesController.class);

	@Autowired
	@Qualifier("rovermar01.SysaUatMessagesService")
	private SysaUatMessagesService sysaUatMessagesService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of SysaUatMessages instances matching the search criteria.")
	public Page<SysaUatMessages> findSysaUatMessagess( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering SysaUatMessagess list");
		return sysaUatMessagesService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of SysaUatMessages instances.")
	public Page<SysaUatMessages> getSysaUatMessagess(Pageable pageable) {
		LOGGER.debug("Rendering SysaUatMessagess list");
		return sysaUatMessagesService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of SysaUatMessages instances.")
	public Long countAllSysaUatMessagess() {
		LOGGER.debug("counting SysaUatMessagess");
		Long count = sysaUatMessagesService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the SysaUatMessages instance associated with the given id.")
    public SysaUatMessages getSysaUatMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting SysaUatMessages with id: {}" , id);
        SysaUatMessages instance = sysaUatMessagesService.findById(id);
        LOGGER.debug("SysaUatMessages details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the SysaUatMessages instance associated with the given id.")
    public boolean deleteSysaUatMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting SysaUatMessages with id: {}" , id);
        SysaUatMessages deleted = sysaUatMessagesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the SysaUatMessages instance associated with the given id.")
    public SysaUatMessages editSysaUatMessages(@PathVariable("id") Integer id, @RequestBody SysaUatMessages instance) throws EntityNotFoundException {
        LOGGER.debug("Editing SysaUatMessages with id: {}" , instance.getId());
        instance.setId(id);
        instance = sysaUatMessagesService.update(instance);
        LOGGER.debug("SysaUatMessages details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new SysaUatMessages instance.")
	public SysaUatMessages createSysaUatMessages(@RequestBody SysaUatMessages instance) {
		LOGGER.debug("Create SysaUatMessages with information: {}" , instance);
		instance = sysaUatMessagesService.create(instance);
		LOGGER.debug("Created SysaUatMessages with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setSysaUatMessagesService(SysaUatMessagesService service) {
		this.sysaUatMessagesService = service;
	}
}
