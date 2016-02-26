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
 * ServiceImpl object for domain model class CollatedResults.
 * @see com.roverpoc.rovermar01.CollatedResults
 */
@Service("rovermar01.CollatedResultsService")
public class CollatedResultsServiceImpl implements CollatedResultsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(CollatedResultsServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.CollatedResultsDao")
    private WMGenericDao<CollatedResults, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<CollatedResults, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<CollatedResults> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public CollatedResults create(CollatedResults collatedresults) {
        LOGGER.debug("Creating a new collatedresults with information: {}" , collatedresults);
        return this.wmGenericDao.create(collatedresults);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public CollatedResults delete(Integer collatedresultsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting collatedresults with id: {}" , collatedresultsId);
        CollatedResults deleted = this.wmGenericDao.findById(collatedresultsId);
        if (deleted == null) {
            LOGGER.debug("No collatedresults found with id: {}" , collatedresultsId);
            throw new EntityNotFoundException(String.valueOf(collatedresultsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<CollatedResults> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all collatedresultss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<CollatedResults> findAll(Pageable pageable) {
        LOGGER.debug("Finding all collatedresultss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public CollatedResults findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding collatedresults by id: {}" , id);
        CollatedResults collatedresults=this.wmGenericDao.findById(id);
        if(collatedresults==null){
            LOGGER.debug("No collatedresults found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return collatedresults;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public CollatedResults update(CollatedResults updated) throws EntityNotFoundException {
        LOGGER.debug("Updating collatedresults with information: {}" , updated);
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


