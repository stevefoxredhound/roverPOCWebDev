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
 * ServiceImpl object for domain model class CollatedGroups.
 * @see com.roverpoc.rovermar01.CollatedGroups
 */
@Service("rovermar01.CollatedGroupsService")
public class CollatedGroupsServiceImpl implements CollatedGroupsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(CollatedGroupsServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.CollatedGroupsDao")
    private WMGenericDao<CollatedGroups, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<CollatedGroups, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<CollatedGroups> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public CollatedGroups create(CollatedGroups collatedgroups) {
        LOGGER.debug("Creating a new collatedgroups with information: {}" , collatedgroups);
        return this.wmGenericDao.create(collatedgroups);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public CollatedGroups delete(Integer collatedgroupsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting collatedgroups with id: {}" , collatedgroupsId);
        CollatedGroups deleted = this.wmGenericDao.findById(collatedgroupsId);
        if (deleted == null) {
            LOGGER.debug("No collatedgroups found with id: {}" , collatedgroupsId);
            throw new EntityNotFoundException(String.valueOf(collatedgroupsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<CollatedGroups> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all collatedgroupss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<CollatedGroups> findAll(Pageable pageable) {
        LOGGER.debug("Finding all collatedgroupss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public CollatedGroups findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding collatedgroups by id: {}" , id);
        CollatedGroups collatedgroups=this.wmGenericDao.findById(id);
        if(collatedgroups==null){
            LOGGER.debug("No collatedgroups found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return collatedgroups;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public CollatedGroups update(CollatedGroups updated) throws EntityNotFoundException {
        LOGGER.debug("Updating collatedgroups with information: {}" , updated);
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

