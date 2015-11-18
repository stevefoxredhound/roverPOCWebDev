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
 * ServiceImpl object for domain model class Classifications.
 * @see com.roverpoc.rovermar01.Classifications
 */
@Service("rovermar01.ClassificationsService")
public class ClassificationsServiceImpl implements ClassificationsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ClassificationsServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.ClassificationsDao")
    private WMGenericDao<Classifications, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Classifications, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<Classifications> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public Classifications create(Classifications classifications) {
        LOGGER.debug("Creating a new classifications with information: {}" , classifications);
        return this.wmGenericDao.create(classifications);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public Classifications delete(Integer classificationsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting classifications with id: {}" , classificationsId);
        Classifications deleted = this.wmGenericDao.findById(classificationsId);
        if (deleted == null) {
            LOGGER.debug("No classifications found with id: {}" , classificationsId);
            throw new EntityNotFoundException(String.valueOf(classificationsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<Classifications> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all classificationss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<Classifications> findAll(Pageable pageable) {
        LOGGER.debug("Finding all classificationss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Classifications findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding classifications by id: {}" , id);
        Classifications classifications=this.wmGenericDao.findById(id);
        if(classifications==null){
            LOGGER.debug("No classifications found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return classifications;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public Classifications update(Classifications updated) throws EntityNotFoundException {
        LOGGER.debug("Updating classifications with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getId());
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

