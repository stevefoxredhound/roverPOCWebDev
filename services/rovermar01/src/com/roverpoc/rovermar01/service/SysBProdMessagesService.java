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
 * Service object for domain model class SysBProdMessages.
 * @see com.roverpoc.rovermar01.SysBProdMessages
 */

public interface SysBProdMessagesService {
   /**
	 * Creates a new sysbprodmessages.
	 * 
	 * @param created
	 *            The information of the created sysbprodmessages.
	 * @return The created sysbprodmessages.
	 */
	public SysBProdMessages create(SysBProdMessages created);

	/**
	 * Deletes a sysbprodmessages.
	 * 
	 * @param sysbprodmessagesId
	 *            The id of the deleted sysbprodmessages.
	 * @return The deleted sysbprodmessages.
	 * @throws EntityNotFoundException
	 *             if no sysbprodmessages is found with the given id.
	 */
	public SysBProdMessages delete(Integer sysbprodmessagesId) throws EntityNotFoundException;

	/**
	 * Finds all sysbprodmessagess.
	 * 
	 * @return A list of sysbprodmessagess.
	 */
	public Page<SysBProdMessages> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<SysBProdMessages> findAll(Pageable pageable);
	
	/**
	 * Finds sysbprodmessages by id.
	 * 
	 * @param id
	 *            The id of the wanted sysbprodmessages.
	 * @return The found sysbprodmessages. If no sysbprodmessages is found, this method returns
	 *         null.
	 */
	public SysBProdMessages findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a sysbprodmessages.
	 * 
	 * @param updated
	 *            The information of the updated sysbprodmessages.
	 * @return The updated sysbprodmessages.
	 * @throws EntityNotFoundException
	 *             if no sysbprodmessages is found with given id.
	 */
	public SysBProdMessages update(SysBProdMessages updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the sysbprodmessagess in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the sysbprodmessages.
	 */

	public long countAll();


    public Page<SysBProdMessages> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
