package com.backend.ecommerce.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.ecommerce.admin.Model.User;


public interface RegistrationRepository extends JpaRepository <User , Long>{
	
	public User findByEmailId (String emailId);
	public User findByEmailIdAndPassword(String emailId , String password);

}
