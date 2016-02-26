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
 * ServiceImpl object for domain model class ConnectGmiDataBothGmi256.
 * @see com.roverpoc.rovermar01.ConnectGmiDataBothGmi256
 */
@Service("rovermar01.ConnectGmiDataBothGmi256Service")
public class ConnectGmiDataBothGmi256ServiceImpl implements ConnectGmiDataBothGmi256Service {


    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectGmiDataBothGmi256ServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.ConnectGmiDataBothGmi256Dao")
    private WMGenericDao<ConnectGmiDataBothGmi256, ConnectGmiDataBothGmi256Id> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ConnectGmiDataBothGmi256, ConnectGmiDataBothGmi256Id> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<ConnectGmiDataBothGmi256> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataBothGmi256 create(ConnectGmiDataBothGmi256 connectgmidatabothgmi256) {
        LOGGER.debug("Creating a new connectgmidatabothgmi256 with information: {}" , connectgmidatabothgmi256);
        return this.wmGenericDao.create(connectgmidatabothgmi256);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataBothGmi256 delete(ConnectGmiDataBothGmi256Id connectgmidatabothgmi256Id) throws EntityNotFoundException {
        LOGGER.debug("Deleting connectgmidatabothgmi256 with id: {}" , connectgmidatabothgmi256Id);
        ConnectGmiDataBothGmi256 deleted = this.wmGenericDao.findById(connectgmidatabothgmi256Id);
        if (deleted == null) {
            LOGGER.debug("No connectgmidatabothgmi256 found with id: {}" , connectgmidatabothgmi256Id);
            throw new EntityNotFoundException(String.valueOf(connectgmidatabothgmi256Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<ConnectGmiDataBothGmi256> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all connectgmidatabothgmi256s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<ConnectGmiDataBothGmi256> findAll(Pageable pageable) {
        LOGGER.debug("Finding all connectgmidatabothgmi256s");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataBothGmi256 findById(ConnectGmiDataBothGmi256Id id) throws EntityNotFoundException {
        LOGGER.debug("Finding connectgmidatabothgmi256 by id: {}" , id);
        ConnectGmiDataBothGmi256 connectgmidatabothgmi256=this.wmGenericDao.findById(id);
        if(connectgmidatabothgmi256==null){
            LOGGER.debug("No connectgmidatabothgmi256 found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return connectgmidatabothgmi256;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataBothGmi256 update(ConnectGmiDataBothGmi256 updated) throws EntityNotFoundException {
        LOGGER.debug("Updating connectgmidatabothgmi256 with information: {}" , updated);
        this.wmGenericDao.update(updated);

        ConnectGmiDataBothGmi256Id id = new ConnectGmiDataBothGmi256Id();
        id.setCoreKey(updated.getCoreKey());
        id.setCoreProcessDate(updated.getCoreProcessDate());
        id.setPrice(updated.getPrice());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

