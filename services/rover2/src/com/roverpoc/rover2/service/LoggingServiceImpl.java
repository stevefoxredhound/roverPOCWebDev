/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rover2.service;

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

import com.roverpoc.rover2.*;


/**
 * ServiceImpl object for domain model class Logging.
 * @see com.roverpoc.rover2.Logging
 */
@Service("rover2.LoggingService")
public class LoggingServiceImpl implements LoggingService {


    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingServiceImpl.class);

    @Autowired
    @Qualifier("rover2.LoggingDao")
    private WMGenericDao<Logging, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Logging, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rover2TransactionManager")
     public Page<Logging> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rover2TransactionManager")
    @Override
    public Logging create(Logging logging) {
        LOGGER.debug("Creating a new logging with information: {}" , logging);
        return this.wmGenericDao.create(logging);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rover2TransactionManager")
    @Override
    public Logging delete(Integer loggingId) throws EntityNotFoundException {
        LOGGER.debug("Deleting logging with id: {}" , loggingId);
        Logging deleted = this.wmGenericDao.findById(loggingId);
        if (deleted == null) {
            LOGGER.debug("No logging found with id: {}" , loggingId);
            throw new EntityNotFoundException(String.valueOf(loggingId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Page<Logging> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all loggings");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Page<Logging> findAll(Pageable pageable) {
        LOGGER.debug("Finding all loggings");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Logging findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding logging by id: {}" , id);
        Logging logging=this.wmGenericDao.findById(id);
        if(logging==null){
            LOGGER.debug("No logging found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return logging;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rover2TransactionManager")
    @Override
    public Logging update(Logging updated) throws EntityNotFoundException {
        LOGGER.debug("Updating logging with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getId());
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

