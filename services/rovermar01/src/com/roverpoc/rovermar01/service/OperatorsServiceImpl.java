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
 * ServiceImpl object for domain model class Operators.
 * @see com.roverpoc.rovermar01.Operators
 */
@Service("rovermar01.OperatorsService")
public class OperatorsServiceImpl implements OperatorsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(OperatorsServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.OperatorsDao")
    private WMGenericDao<Operators, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Operators, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<Operators> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public Operators create(Operators operators) {
        LOGGER.debug("Creating a new operators with information: {}" , operators);
        return this.wmGenericDao.create(operators);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public Operators delete(Integer operatorsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting operators with id: {}" , operatorsId);
        Operators deleted = this.wmGenericDao.findById(operatorsId);
        if (deleted == null) {
            LOGGER.debug("No operators found with id: {}" , operatorsId);
            throw new EntityNotFoundException(String.valueOf(operatorsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<Operators> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all operatorss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<Operators> findAll(Pageable pageable) {
        LOGGER.debug("Finding all operatorss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Operators findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding operators by id: {}" , id);
        Operators operators=this.wmGenericDao.findById(id);
        if(operators==null){
            LOGGER.debug("No operators found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return operators;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public Operators update(Operators updated) throws EntityNotFoundException {
        LOGGER.debug("Updating operators with information: {}" , updated);
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


