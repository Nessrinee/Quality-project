package com.backend.ecommerce.admin.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ecommerce.admin.Model.User;



@Repository
public interface UserRepository extends JpaRepository<User , Long>{

	 Optional<User> findByUserName (String userName);
	 
	 List<User> findAllByEmailId (String emailId);
}
