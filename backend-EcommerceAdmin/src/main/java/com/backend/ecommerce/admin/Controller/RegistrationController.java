package com.backend.ecommerce.admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ecommerce.admin.Model.User;
import com.backend.ecommerce.admin.Service.RegistrationService;



@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service ;
	
	@PostMapping(value ="/register")
	public User registerUtilisateur (@RequestBody User user ) throws Exception {
		
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && "".equals(tempEmailId)) {
			User utilisateurObj = service.fetchUserByEmailId(tempEmailId);
			if (utilisateurObj != null) {
				throw new Exception ("utilisateur with " +tempEmailId+ "is already exist");
			}
		}
		User utilisateurObj = null ; 
		utilisateurObj = service.saveUtilisateur(user);
		return  utilisateurObj;
	}
	
	@PostMapping (value ="/login")
	public User loginUtilisateur(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User utilisateurObj = null ;
		if (tempEmailId != null && tempPass != null) {
			utilisateurObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
			
		}
		if (utilisateurObj == null ) {
			throw new Exception ("Bad Credentials ");
			
		}
		return  utilisateurObj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
