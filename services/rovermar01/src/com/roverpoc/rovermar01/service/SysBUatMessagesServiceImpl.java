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
 * ServiceImpl object for domain model class SysBUatMessages.
 * @see com.roverpoc.rovermar01.SysBUatMessages
 */
@Service("rovermar01.SysBUatMessagesService")
public class SysBUatMessagesServiceImpl implements SysBUatMessagesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(SysBUatMessagesServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.SysBUatMessagesDao")
    private WMGenericDao<SysBUatMessages, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<SysBUatMessages, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<SysBUatMessages> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public SysBUatMessages create(SysBUatMessages sysbuatmessages) {
        LOGGER.debug("Creating a new sysbuatmessages with information: {}" , sysbuatmessages);
        return this.wmGenericDao.create(sysbuatmessages);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public SysBUatMessages delete(Integer sysbuatmessagesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting sysbuatmessages with id: {}" , sysbuatmessagesId);
        SysBUatMessages deleted = this.wmGenericDao.findById(sysbuatmessagesId);
        if (deleted == null) {
            LOGGER.debug("No sysbuatmessages found with id: {}" , sysbuatmessagesId);
            throw new EntityNotFoundException(String.valueOf(sysbuatmessagesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<SysBUatMessages> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all sysbuatmessagess");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<SysBUatMessages> findAll(Pageable pageable) {
        LOGGER.debug("Finding all sysbuatmessagess");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public SysBUatMessages findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding sysbuatmessages by id: {}" , id);
        SysBUatMessages sysbuatmessages=this.wmGenericDao.findById(id);
        if(sysbuatmessages==null){
            LOGGER.debug("No sysbuatmessages found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return sysbuatmessages;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public SysBUatMessages update(SysBUatMessages updated) throws EntityNotFoundException {
        LOGGER.debug("Updating sysbuatmessages with information: {}" , updated);
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


