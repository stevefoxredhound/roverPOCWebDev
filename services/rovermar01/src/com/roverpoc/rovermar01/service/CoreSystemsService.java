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
 * Service object for domain model class CoreSystems.
 * @see com.roverpoc.rovermar01.CoreSystems
 */

public interface CoreSystemsService {
   /**
	 * Creates a new coresystems.
	 * 
	 * @param created
	 *            The information of the created coresystems.
	 * @return The created coresystems.
	 */
	public CoreSystems create(CoreSystems created);

	/**
	 * Deletes a coresystems.
	 * 
	 * @param coresystemsId
	 *            The id of the deleted coresystems.
	 * @return The deleted coresystems.
	 * @throws EntityNotFoundException
	 *             if no coresystems is found with the given id.
	 */
	public CoreSystems delete(Integer coresystemsId) throws EntityNotFoundException;

	/**
	 * Finds all coresystemss.
	 * 
	 * @return A list of coresystemss.
	 */
	public Page<CoreSystems> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<CoreSystems> findAll(Pageable pageable);
	
	/**
	 * Finds coresystems by id.
	 * 
	 * @param id
	 *            The id of the wanted coresystems.
	 * @return The found coresystems. If no coresystems is found, this method returns
	 *         null.
	 */
	public CoreSystems findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a coresystems.
	 * 
	 * @param updated
	 *            The information of the updated coresystems.
	 * @return The updated coresystems.
	 * @throws EntityNotFoundException
	 *             if no coresystems is found with given id.
	 */
	public CoreSystems update(CoreSystems updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the coresystemss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the coresystems.
	 */

	public long countAll();


    public Page<CoreSystems> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

