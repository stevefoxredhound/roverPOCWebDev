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
 * Service object for domain model class CategorisationRules.
 * @see com.roverpoc.rover2.CategorisationRules
 */

public interface CategorisationRulesService {
   /**
	 * Creates a new categorisationrules.
	 * 
	 * @param created
	 *            The information of the created categorisationrules.
	 * @return The created categorisationrules.
	 */
	public CategorisationRules create(CategorisationRules created);

	/**
	 * Deletes a categorisationrules.
	 * 
	 * @param categorisationrulesId
	 *            The id of the deleted categorisationrules.
	 * @return The deleted categorisationrules.
	 * @throws EntityNotFoundException
	 *             if no categorisationrules is found with the given id.
	 */
	public CategorisationRules delete(Integer categorisationrulesId) throws EntityNotFoundException;

	/**
	 * Finds all categorisationruless.
	 * 
	 * @return A list of categorisationruless.
	 */
	public Page<CategorisationRules> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<CategorisationRules> findAll(Pageable pageable);
	
	/**
	 * Finds categorisationrules by id.
	 * 
	 * @param id
	 *            The id of the wanted categorisationrules.
	 * @return The found categorisationrules. If no categorisationrules is found, this method returns
	 *         null.
	 */
	public CategorisationRules findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a categorisationrules.
	 * 
	 * @param updated
	 *            The information of the updated categorisationrules.
	 * @return The updated categorisationrules.
	 * @throws EntityNotFoundException
	 *             if no categorisationrules is found with given id.
	 */
	public CategorisationRules update(CategorisationRules updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the categorisationruless in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the categorisationrules.
	 */

	public long countAll();


    public Page<CategorisationRules> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

