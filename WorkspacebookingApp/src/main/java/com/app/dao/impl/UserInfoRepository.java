package com.app.dao.impl;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.UserInfo;




@Repository
@Transactional
public interface UserInfoRepository extends CrudRepository<UserInfo, String> {
	
	
    @Query("SELECT u FROM UserInfo u WHERE u.userName = :username AND u.enabled=1")
	public UserInfo getActiveUser(@Param("username") String username);
		
}