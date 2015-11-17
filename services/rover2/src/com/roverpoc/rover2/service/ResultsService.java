/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rover2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.roverpoc.rover2.*;

/**
 * Service object for domain model class Results.
 * @see com.roverpoc.rover2.Results
 */

public interface ResultsService {
   /**
	 * Creates a new results.
	 * 
	 * @param created
	 *            The information of the created results.
	 * @return The created results.
	 */
	public Results create(Results created);

	/**
	 * Deletes a results.
	 * 
	 * @param resultsId
	 *            The id of the deleted results.
	 * @return The deleted results.
	 * @throws EntityNotFoundException
	 *             if no results is found with the given id.
	 */
	public Results delete(Integer resultsId) throws EntityNotFoundException;

	/**
	 * Finds all resultss.
	 * 
	 * @return A list of resultss.
	 */
	public Page<Results> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Results> findAll(Pageable pageable);
	
	/**
	 * Finds results by id.
	 * 
	 * @param id
	 *            The id of the wanted results.
	 * @return The found results. If no results is found, this method returns
	 *         null.
	 */
	public Results findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a results.
	 * 
	 * @param updated
	 *            The information of the updated results.
	 * @return The updated results.
	 * @throws EntityNotFoundException
	 *             if no results is found with given id.
	 */
	public Results update(Results updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the resultss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the results.
	 */

	public long countAll();


    public Page<Results> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

