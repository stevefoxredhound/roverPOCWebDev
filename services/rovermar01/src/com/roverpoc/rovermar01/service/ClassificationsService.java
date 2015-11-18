/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.roverpoc.rovermar01.*;

/**
 * Service object for domain model class Classifications.
 * @see com.roverpoc.rovermar01.Classifications
 */

public interface ClassificationsService {
   /**
	 * Creates a new classifications.
	 * 
	 * @param created
	 *            The information of the created classifications.
	 * @return The created classifications.
	 */
	public Classifications create(Classifications created);

	/**
	 * Deletes a classifications.
	 * 
	 * @param classificationsId
	 *            The id of the deleted classifications.
	 * @return The deleted classifications.
	 * @throws EntityNotFoundException
	 *             if no classifications is found with the given id.
	 */
	public Classifications delete(Integer classificationsId) throws EntityNotFoundException;

	/**
	 * Finds all classificationss.
	 * 
	 * @return A list of classificationss.
	 */
	public Page<Classifications> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Classifications> findAll(Pageable pageable);
	
	/**
	 * Finds classifications by id.
	 * 
	 * @param id
	 *            The id of the wanted classifications.
	 * @return The found classifications. If no classifications is found, this method returns
	 *         null.
	 */
	public Classifications findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a classifications.
	 * 
	 * @param updated
	 *            The information of the updated classifications.
	 * @return The updated classifications.
	 * @throws EntityNotFoundException
	 *             if no classifications is found with given id.
	 */
	public Classifications update(Classifications updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the classificationss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the classifications.
	 */

	public long countAll();


    public Page<Classifications> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
