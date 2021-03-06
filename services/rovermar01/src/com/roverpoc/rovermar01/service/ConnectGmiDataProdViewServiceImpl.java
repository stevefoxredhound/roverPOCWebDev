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
 * ServiceImpl object for domain model class ConnectGmiDataProdView.
 * @see com.roverpoc.rovermar01.ConnectGmiDataProdView
 */
@Service("rovermar01.ConnectGmiDataProdViewService")
public class ConnectGmiDataProdViewServiceImpl implements ConnectGmiDataProdViewService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectGmiDataProdViewServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.ConnectGmiDataProdViewDao")
    private WMGenericDao<ConnectGmiDataProdView, ConnectGmiDataProdViewId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ConnectGmiDataProdView, ConnectGmiDataProdViewId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<ConnectGmiDataProdView> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataProdView create(ConnectGmiDataProdView connectgmidataprodview) {
        LOGGER.debug("Creating a new connectgmidataprodview with information: {}" , connectgmidataprodview);
        return this.wmGenericDao.create(connectgmidataprodview);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataProdView delete(ConnectGmiDataProdViewId connectgmidataprodviewId) throws EntityNotFoundException {
        LOGGER.debug("Deleting connectgmidataprodview with id: {}" , connectgmidataprodviewId);
        ConnectGmiDataProdView deleted = this.wmGenericDao.findById(connectgmidataprodviewId);
        if (deleted == null) {
            LOGGER.debug("No connectgmidataprodview found with id: {}" , connectgmidataprodviewId);
            throw new EntityNotFoundException(String.valueOf(connectgmidataprodviewId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<ConnectGmiDataProdView> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all connectgmidataprodviews");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<ConnectGmiDataProdView> findAll(Pageable pageable) {
        LOGGER.debug("Finding all connectgmidataprodviews");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataProdView findById(ConnectGmiDataProdViewId id) throws EntityNotFoundException {
        LOGGER.debug("Finding connectgmidataprodview by id: {}" , id);
        ConnectGmiDataProdView connectgmidataprodview=this.wmGenericDao.findById(id);
        if(connectgmidataprodview==null){
            LOGGER.debug("No connectgmidataprodview found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return connectgmidataprodview;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public ConnectGmiDataProdView update(ConnectGmiDataProdView updated) throws EntityNotFoundException {
        LOGGER.debug("Updating connectgmidataprodview with information: {}" , updated);
        this.wmGenericDao.update(updated);

        ConnectGmiDataProdViewId id = new ConnectGmiDataProdViewId();
        id.setId(updated.getId());
        id.setDateTime(updated.getDateTime());
        id.setCoreSystem(updated.getCoreSystem());
        id.setCoreKey(updated.getCoreKey());
        id.setCoreProcessDate(updated.getCoreProcessDate());
        id.setTradeDate(updated.getTradeDate());
        id.setMember(updated.getMember());
        id.setTrader(updated.getTrader());
        id.setQty(updated.getQty());
        id.setPrice(updated.getPrice());
        id.setProduct(updated.getProduct());
        id.setExpiry(updated.getExpiry());
        id.setCurrency(updated.getCurrency());
        id.setBuySell(updated.getBuySell());
        id.setProductIsin(updated.getProductIsin());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


