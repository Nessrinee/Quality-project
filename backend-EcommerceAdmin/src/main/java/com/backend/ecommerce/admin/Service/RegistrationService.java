package com.backend.ecommerce.admin.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ecommerce.admin.Model.User;

import com.backend.ecommerce.admin.Repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repo; 
	
	public User saveUtilisateur(User utilisateur ) {
		
		return repo.save(utilisateur);
	}
	
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
		
	}
	
	public User fetchUserByEmailIdAndPassword(String email , String Password) {
		return repo.findByEmailIdAndPassword(email, Password);
		
	}

}
