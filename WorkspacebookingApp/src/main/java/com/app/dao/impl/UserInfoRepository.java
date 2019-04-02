package com.app.dao.impl;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.entities.UserSecInfo;




@Repository
@Transactional
public interface UserInfoRepository extends CrudRepository<UserSecInfo, String> {
	
	
    @Query("SELECT u FROM UserSecInfo u WHERE u.userName = :username AND u.enabled=1")
	public UserSecInfo getActiveUser(@Param("username") String username);
    
    @Query( value="SELECT * FROM USERSECINFO u WHERE u.emp_id= :empid AND u.enabled=1",nativeQuery = true)
    public UserSecInfo getUserByEmpId(@Param("empid") Long empid);
		
}