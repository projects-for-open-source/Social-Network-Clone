/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: richardvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2021
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.richard.application.io.entities.RoleEntity;

/**
 * @author admin
 *
 */
@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
	
	/**
	 * @param name
	 * @return
	 */
	RoleEntity findByName(String name);
	
}