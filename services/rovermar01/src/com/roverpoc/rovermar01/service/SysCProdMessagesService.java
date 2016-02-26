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
 * Service object for domain model class SysCProdMessages.
 * @see com.roverpoc.rovermar01.SysCProdMessages
 */

public interface SysCProdMessagesService {
   /**
	 * Creates a new syscprodmessages.
	 * 
	 * @param created
	 *            The information of the created syscprodmessages.
	 * @return The created syscprodmessages.
	 */
	public SysCProdMessages create(SysCProdMessages created);

	/**
	 * Deletes a syscprodmessages.
	 * 
	 * @param syscprodmessagesId
	 *            The id of the deleted syscprodmessages.
	 * @return The deleted syscprodmessages.
	 * @throws EntityNotFoundException
	 *             if no syscprodmessages is found with the given id.
	 */
	public SysCProdMessages delete(Integer syscprodmessagesId) throws EntityNotFoundException;

	/**
	 * Finds all syscprodmessagess.
	 * 
	 * @return A list of syscprodmessagess.
	 */
	public Page<SysCProdMessages> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<SysCProdMessages> findAll(Pageable pageable);
	
	/**
	 * Finds syscprodmessages by id.
	 * 
	 * @param id
	 *            The id of the wanted syscprodmessages.
	 * @return The found syscprodmessages. If no syscprodmessages is found, this method returns
	 *         null.
	 */
	public SysCProdMessages findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a syscprodmessages.
	 * 
	 * @param updated
	 *            The information of the updated syscprodmessages.
	 * @return The updated syscprodmessages.
	 * @throws EntityNotFoundException
	 *             if no syscprodmessages is found with given id.
	 */
	public SysCProdMessages update(SysCProdMessages updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the syscprodmessagess in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the syscprodmessages.
	 */

	public long countAll();


    public Page<SysCProdMessages> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

