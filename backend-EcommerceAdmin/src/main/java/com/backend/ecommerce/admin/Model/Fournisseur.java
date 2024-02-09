package com.backend.ecommerce.admin.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "fournisseur",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "code"
				+ ""),
		@UniqueConstraint(columnNames = "email") 
	})
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int code ;
	/*
	@NotBlank
	@Size(max = 60)
	*/
	private String libelle;
	private String nom;
	private String adresse;
	private String ville;
	/**
	@NotBlank
	@size(max=60)
	@Email
	**/
	private String email;
	private int tel;
	
	
// Constructor
	public Fournisseur(long id, int code, String libelle, String nom, String adresse, String ville, String email, int tel) {
	super();
	this.id = id;
	this.code = code;
	this.libelle = libelle;
	this.nom = nom;
	this.adresse = adresse;
	this.ville = ville;
	this.email = email;
	this.tel = tel;
}

	

// Getter & Setter

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
    

	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getTel() {
		return tel;
	}



	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	

}
