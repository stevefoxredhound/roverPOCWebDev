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
 * Service object for domain model class UserLogin.
 * @see com.roverpoc.rovermar01.UserLogin
 */

public interface UserLoginService {
   /**
	 * Creates a new userlogin.
	 * 
	 * @param created
	 *            The information of the created userlogin.
	 * @return The created userlogin.
	 */
	public UserLogin create(UserLogin created);

	/**
	 * Deletes a userlogin.
	 * 
	 * @param userloginId
	 *            The id of the deleted userlogin.
	 * @return The deleted userlogin.
	 * @throws EntityNotFoundException
	 *             if no userlogin is found with the given id.
	 */
	public UserLogin delete(Integer userloginId) throws EntityNotFoundException;

	/**
	 * Finds all userlogins.
	 * 
	 * @return A list of userlogins.
	 */
	public Page<UserLogin> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<UserLogin> findAll(Pageable pageable);
	
	/**
	 * Finds userlogin by id.
	 * 
	 * @param id
	 *            The id of the wanted userlogin.
	 * @return The found userlogin. If no userlogin is found, this method returns
	 *         null.
	 */
	public UserLogin findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a userlogin.
	 * 
	 * @param updated
	 *            The information of the updated userlogin.
	 * @return The updated userlogin.
	 * @throws EntityNotFoundException
	 *             if no userlogin is found with given id.
	 */
	public UserLogin update(UserLogin updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the userlogins in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the userlogin.
	 */

	public long countAll();


    public Page<UserLogin> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

