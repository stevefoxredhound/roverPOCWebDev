/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.roverpoc.rovermar01.service.CategorisationRulesService;
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
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class CategorisationRules.
 * @see com.roverpoc.rovermar01.CategorisationRules
 */
@RestController(value = "Rovermar01.CategorisationRulesController")
@RequestMapping("/rovermar01/CategorisationRules")
@Api(description = "Exposes APIs to work with CategorisationRules resource.", value = "CategorisationRulesController")
public class CategorisationRulesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategorisationRulesController.class);

    @Autowired
    @Qualifier("rovermar01.CategorisationRulesService")
    private CategorisationRulesService categorisationRulesService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of CategorisationRules instances matching the search criteria.")
    public Page<CategorisationRules> findCategorisationRuless(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering CategorisationRuless list");
        return categorisationRulesService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of CategorisationRules instances.")
    public Page<CategorisationRules> getCategorisationRuless(Pageable pageable) {
        LOGGER.debug("Rendering CategorisationRuless list");
        return categorisationRulesService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setCategorisationRulesService(CategorisationRulesService service) {
        this.categorisationRulesService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new CategorisationRules instance.")
    public CategorisationRules createCategorisationRules(@RequestBody CategorisationRules instance) {
        LOGGER.debug("Create CategorisationRules with information: {}", instance);
        instance = categorisationRulesService.create(instance);
        LOGGER.debug("Created CategorisationRules with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of CategorisationRules instances.")
    public Long countAllCategorisationRuless() {
        LOGGER.debug("counting CategorisationRuless");
        Long count = categorisationRulesService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the CategorisationRules instance associated with the given id.")
    public CategorisationRules getCategorisationRules(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting CategorisationRules with id: {}", id);
        CategorisationRules instance = categorisationRulesService.findById(id);
        LOGGER.debug("CategorisationRules details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the CategorisationRules instance associated with the given id.")
    public CategorisationRules editCategorisationRules(@PathVariable(value = "id") Integer id, @RequestBody CategorisationRules instance) throws EntityNotFoundException {
        LOGGER.debug("Editing CategorisationRules with id: {}", instance.getId());
        instance.setId(id);
        instance = categorisationRulesService.update(instance);
        LOGGER.debug("CategorisationRules details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the CategorisationRules instance associated with the given id.")
    public boolean deleteCategorisationRules(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting CategorisationRules with id: {}", id);
        CategorisationRules deleted = categorisationRulesService.delete(id);
        return deleted != null;
    }
}
