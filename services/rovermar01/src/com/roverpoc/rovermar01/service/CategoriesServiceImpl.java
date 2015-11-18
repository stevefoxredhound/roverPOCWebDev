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
 * ServiceImpl object for domain model class Categories.
 * @see com.roverpoc.rovermar01.Categories
 */
@Service("rovermar01.CategoriesService")
public class CategoriesServiceImpl implements CategoriesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriesServiceImpl.class);

    @Autowired
    @Qualifier("rovermar01.CategoriesDao")
    private WMGenericDao<Categories, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Categories, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "rovermar01TransactionManager")
     public Page<Categories> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "rovermar01TransactionManager")
    @Override
    public Categories create(Categories categories) {
        LOGGER.debug("Creating a new categories with information: {}" , categories);
        return this.wmGenericDao.create(categories);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public Categories delete(Integer categoriesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting categories with id: {}" , categoriesId);
        Categories deleted = this.wmGenericDao.findById(categoriesId);
        if (deleted == null) {
            LOGGER.debug("No categories found with id: {}" , categoriesId);
            throw new EntityNotFoundException(String.valueOf(categoriesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<Categories> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all categoriess");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Page<Categories> findAll(Pageable pageable) {
        LOGGER.debug("Finding all categoriess");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public Categories findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding categories by id: {}" , id);
        Categories categories=this.wmGenericDao.findById(id);
        if(categories==null){
            LOGGER.debug("No categories found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return categories;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "rovermar01TransactionManager")
    @Override
    public Categories update(Categories updated) throws EntityNotFoundException {
        LOGGER.debug("Updating categories with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getId());
    }

    @Transactional(readOnly = true, value = "rovermar01TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


