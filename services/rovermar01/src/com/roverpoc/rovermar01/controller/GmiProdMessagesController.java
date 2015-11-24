/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.roverpoc.rovermar01.service.GmiProdMessagesService;
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
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class GmiProdMessages.
 * @see com.roverpoc.rovermar01.GmiProdMessages
 */
@RestController(value = "Rovermar01.GmiProdMessagesController")
@RequestMapping("/rovermar01/GmiProdMessages")
@Api(description = "Exposes APIs to work with GmiProdMessages resource.", value = "GmiProdMessagesController")
public class GmiProdMessagesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GmiProdMessagesController.class);

    @Autowired
    @Qualifier("rovermar01.GmiProdMessagesService")
    private GmiProdMessagesService gmiProdMessagesService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of GmiProdMessages instances matching the search criteria.")
    public Page<GmiProdMessages> findGmiProdMessagess(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering GmiProdMessagess list");
        return gmiProdMessagesService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of GmiProdMessages instances.")
    public Page<GmiProdMessages> getGmiProdMessagess(Pageable pageable) {
        LOGGER.debug("Rendering GmiProdMessagess list");
        return gmiProdMessagesService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the GmiProdMessages instance associated with the given id.")
    public GmiProdMessages getGmiProdMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting GmiProdMessages with id: {}", id);
        GmiProdMessages instance = gmiProdMessagesService.findById(id);
        LOGGER.debug("GmiProdMessages details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the GmiProdMessages instance associated with the given id.")
    public boolean deleteGmiProdMessages(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting GmiProdMessages with id: {}", id);
        GmiProdMessages deleted = gmiProdMessagesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the GmiProdMessages instance associated with the given id.")
    public GmiProdMessages editGmiProdMessages(@PathVariable("id") Integer id, @RequestBody GmiProdMessages instance) throws EntityNotFoundException {
        LOGGER.debug("Editing GmiProdMessages with id: {}", instance.getId());
        instance.setId(id);
        instance = gmiProdMessagesService.update(instance);
        LOGGER.debug("GmiProdMessages details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ApiOperation(value = "Creates a new GmiProdMessages instance.")
    public GmiProdMessages createGmiProdMessages(@RequestBody GmiProdMessages instance) {
        LOGGER.debug("Create GmiProdMessages with information: {}", instance);
        instance = gmiProdMessagesService.create(instance);
        LOGGER.debug("Created GmiProdMessages with information: {}", instance);
        return instance;
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setGmiProdMessagesService(GmiProdMessagesService service) {
        this.gmiProdMessagesService = service;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of GmiProdMessages instances.")
    public Long countAllGmiProdMessagess() {
        LOGGER.debug("counting GmiProdMessagess");
        Long count = gmiProdMessagesService.countAll();
        return count;
    }
}
