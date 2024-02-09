package com.backend.ecommerce.admin.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private Long id;
	@Column(name="emailId" , length=255 )
	private String emailId;
	
	@Column(name="userName" , length=255 )
	private String userName;
	
	@Column(name="password" , length=255 )
	private String password;
	
	// Constructor without field 

	public User() {
		super();
	}
	
	// Constructor with field 

	public User(Long id, String emailId, String userName, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
