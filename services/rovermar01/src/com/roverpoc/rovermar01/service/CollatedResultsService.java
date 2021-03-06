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
 * Service object for domain model class CollatedResults.
 * @see com.roverpoc.rovermar01.CollatedResults
 */

public interface CollatedResultsService {
   /**
	 * Creates a new collatedresults.
	 * 
	 * @param created
	 *            The information of the created collatedresults.
	 * @return The created collatedresults.
	 */
	public CollatedResults create(CollatedResults created);

	/**
	 * Deletes a collatedresults.
	 * 
	 * @param collatedresultsId
	 *            The id of the deleted collatedresults.
	 * @return The deleted collatedresults.
	 * @throws EntityNotFoundException
	 *             if no collatedresults is found with the given id.
	 */
	public CollatedResults delete(Integer collatedresultsId) throws EntityNotFoundException;

	/**
	 * Finds all collatedresultss.
	 * 
	 * @return A list of collatedresultss.
	 */
	public Page<CollatedResults> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<CollatedResults> findAll(Pageable pageable);
	
	/**
	 * Finds collatedresults by id.
	 * 
	 * @param id
	 *            The id of the wanted collatedresults.
	 * @return The found collatedresults. If no collatedresults is found, this method returns
	 *         null.
	 */
	public CollatedResults findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a collatedresults.
	 * 
	 * @param updated
	 *            The information of the updated collatedresults.
	 * @return The updated collatedresults.
	 * @throws EntityNotFoundException
	 *             if no collatedresults is found with given id.
	 */
	public CollatedResults update(CollatedResults updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the collatedresultss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the collatedresults.
	 */

	public long countAll();


    public Page<CollatedResults> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

