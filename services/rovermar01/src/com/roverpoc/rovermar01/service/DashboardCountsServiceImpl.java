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
 * ServiceImpl object for domain model class DashboardCounts.
 * @see com.roverpoc.rovermar01.DashboardCounts
 */
@Service("rovermar01.DashboardCountsService")
public class DashboardCountsServiceImpl implements DashboardCountsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardCountsServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.DashboardCountsDao")
    private WMGenericDao<DashboardCounts, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<DashboardCounts, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<DashboardCounts> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public DashboardCounts create(DashboardCounts dashboardcounts) {
        LOGGER.debug("Creating a new dashboardcounts with information: {}" , dashboardcounts);
        return this.wmGenericDao.create(dashboardcounts);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public DashboardCounts delete(Integer dashboardcountsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting dashboardcounts with id: {}" , dashboardcountsId);
        DashboardCounts deleted = this.wmGenericDao.findById(dashboardcountsId);
        if (deleted == null) {
            LOGGER.debug("No dashboardcounts found with id: {}" , dashboardcountsId);
            throw new EntityNotFoundException(String.valueOf(dashboardcountsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<DashboardCounts> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all dashboardcountss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<DashboardCounts> findAll(Pageable pageable) {
        LOGGER.debug("Finding all dashboardcountss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public DashboardCounts findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding dashboardcounts by id: {}" , id);
        DashboardCounts dashboardcounts=this.wmGenericDao.findById(id);
        if(dashboardcounts==null){
            LOGGER.debug("No dashboardcounts found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return dashboardcounts;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public DashboardCounts update(DashboardCounts updated) throws EntityNotFoundException {
        LOGGER.debug("Updating dashboardcounts with information: {}" , updated);
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

