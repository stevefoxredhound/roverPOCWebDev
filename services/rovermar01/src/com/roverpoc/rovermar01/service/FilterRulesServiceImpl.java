/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.roverpoc.rovermar01.*;


/**
 * ServiceImpl object for domain model class FilterRules.
 * @see com.roverpoc.rovermar01.FilterRules
 */
@Service("rovermar01.FilterRulesService")
public class FilterRulesServiceImpl implements FilterRulesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(FilterRulesServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.FilterRulesDao")
    private WMGenericDao<FilterRules, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<FilterRules, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<FilterRules> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public FilterRules create(FilterRules filterrules) {
        LOGGER.debug("Creating a new filterrules with information: {}" , filterrules);
        return this.wmGenericDao.create(filterrules);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public FilterRules delete(Integer filterrulesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting filterrules with id: {}" , filterrulesId);
        FilterRules deleted = this.wmGenericDao.findById(filterrulesId);
        if (deleted == null) {
            LOGGER.debug("No filterrules found with id: {}" , filterrulesId);
            throw new EntityNotFoundException(String.valueOf(filterrulesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<FilterRules> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all filterruless");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<FilterRules> findAll(Pageable pageable) {
        LOGGER.debug("Finding all filterruless");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public FilterRules findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding filterrules by id: {}" , id);
        FilterRules filterrules=this.wmGenericDao.findById(id);
        if(filterrules==null){
            LOGGER.debug("No filterrules found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return filterrules;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public FilterRules update(FilterRules updated) throws EntityNotFoundException {
        LOGGER.debug("Updating filterrules with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Integer id = (Integer)updated.getId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


