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
 * ServiceImpl object for domain model class NclUatMessages1m.
 * @see com.roverpoc.rover2.NclUatMessages1m
 */
@Service("rover2.NclUatMessages1mService")
public class NclUatMessages1mServiceImpl implements NclUatMessages1mService {


    private static final Logger LOGGER = LoggerFactory.getLogger(NclUatMessages1mServiceImpl.class);

    @Autowired
    @Qualifier("rover2.NclUatMessages1mDao")
    private WMGenericDao<NclUatMessages1m, NclUatMessages1mId> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<NclUatMessages1m, NclUatMessages1mId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rover2TransactionManager")
     public Page<NclUatMessages1m> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rover2TransactionManager")
    @Override
    public NclUatMessages1m create(NclUatMessages1m ncluatmessages1m) {
        LOGGER.debug("Creating a new ncluatmessages1m with information: {}" , ncluatmessages1m);
        return this.wmGenericDao.create(ncluatmessages1m);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rover2TransactionManager")
    @Override
    public NclUatMessages1m delete(NclUatMessages1mId ncluatmessages1mId) throws EntityNotFoundException {
        LOGGER.debug("Deleting ncluatmessages1m with id: {}" , ncluatmessages1mId);
        NclUatMessages1m deleted = this.wmGenericDao.findById(ncluatmessages1mId);
        if (deleted == null) {
            LOGGER.debug("No ncluatmessages1m found with id: {}" , ncluatmessages1mId);
            throw new EntityNotFoundException(String.valueOf(ncluatmessages1mId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Page<NclUatMessages1m> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all ncluatmessages1ms");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Page<NclUatMessages1m> findAll(Pageable pageable) {
        LOGGER.debug("Finding all ncluatmessages1ms");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public NclUatMessages1m findById(NclUatMessages1mId id) throws EntityNotFoundException {
        LOGGER.debug("Finding ncluatmessages1m by id: {}" , id);
        NclUatMessages1m ncluatmessages1m=this.wmGenericDao.findById(id);
        if(ncluatmessages1m==null){
            LOGGER.debug("No ncluatmessages1m found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return ncluatmessages1m;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rover2TransactionManager")
    @Override
    public NclUatMessages1m update(NclUatMessages1m updated) throws EntityNotFoundException {
        LOGGER.debug("Updating ncluatmessages1m with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((NclUatMessages1mId)updated.getId());
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

