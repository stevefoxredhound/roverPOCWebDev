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
 * ServiceImpl object for domain model class ProdMessages.
 * @see com.roverpoc.rover2.ProdMessages
 */
@Service("rover2.ProdMessagesService")
public class ProdMessagesServiceImpl implements ProdMessagesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ProdMessagesServiceImpl.class);

    @Autowired
    @Qualifier("rover2.ProdMessagesDao")
    private WMGenericDao<ProdMessages, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<ProdMessages, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rover2TransactionManager")
     public Page<ProdMessages> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rover2TransactionManager")
    @Override
    public ProdMessages create(ProdMessages prodmessages) {
        LOGGER.debug("Creating a new prodmessages with information: {}" , prodmessages);
        return this.wmGenericDao.create(prodmessages);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rover2TransactionManager")
    @Override
    public ProdMessages delete(Integer prodmessagesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting prodmessages with id: {}" , prodmessagesId);
        ProdMessages deleted = this.wmGenericDao.findById(prodmessagesId);
        if (deleted == null) {
            LOGGER.debug("No prodmessages found with id: {}" , prodmessagesId);
            throw new EntityNotFoundException(String.valueOf(prodmessagesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Page<ProdMessages> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all prodmessagess");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public Page<ProdMessages> findAll(Pageable pageable) {
        LOGGER.debug("Finding all prodmessagess");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public ProdMessages findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding prodmessages by id: {}" , id);
        ProdMessages prodmessages=this.wmGenericDao.findById(id);
        if(prodmessages==null){
            LOGGER.debug("No prodmessages found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return prodmessages;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rover2TransactionManager")
    @Override
    public ProdMessages update(ProdMessages updated) throws EntityNotFoundException {
        LOGGER.debug("Updating prodmessages with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getId());
    }

    @Transactional(readOnly = true, value = "rover2TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


