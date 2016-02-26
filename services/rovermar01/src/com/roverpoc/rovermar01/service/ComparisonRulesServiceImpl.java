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
 * ServiceImpl object for domain model class ComparisonRules.
 * @see com.roverpoc.rovermar01.ComparisonRules
 */
@Service("rovermar01.ComparisonRulesService")
public class ComparisonRulesServiceImpl implements ComparisonRulesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonRulesServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.ComparisonRulesDao")
    private WMGenericDao<ComparisonRules, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ComparisonRules, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<ComparisonRules> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public ComparisonRules create(ComparisonRules comparisonrules) {
        LOGGER.debug("Creating a new comparisonrules with information: {}" , comparisonrules);
        return this.wmGenericDao.create(comparisonrules);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public ComparisonRules delete(Integer comparisonrulesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting comparisonrules with id: {}" , comparisonrulesId);
        ComparisonRules deleted = this.wmGenericDao.findById(comparisonrulesId);
        if (deleted == null) {
            LOGGER.debug("No comparisonrules found with id: {}" , comparisonrulesId);
            throw new EntityNotFoundException(String.valueOf(comparisonrulesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<ComparisonRules> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all comparisonruless");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<ComparisonRules> findAll(Pageable pageable) {
        LOGGER.debug("Finding all comparisonruless");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public ComparisonRules findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding comparisonrules by id: {}" , id);
        ComparisonRules comparisonrules=this.wmGenericDao.findById(id);
        if(comparisonrules==null){
            LOGGER.debug("No comparisonrules found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return comparisonrules;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public ComparisonRules update(ComparisonRules updated) throws EntityNotFoundException {
        LOGGER.debug("Updating comparisonrules with information: {}" , updated);
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


