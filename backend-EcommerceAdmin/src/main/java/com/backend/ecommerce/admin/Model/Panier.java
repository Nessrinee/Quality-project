package com.backend.ecommerce.admin.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;




@Entity
@Table(name = "panier")
public class Panier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ; 
	private int annee;
	private int numero;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd" , timezone="GMT")
	private Date date;
	private String nom;
	private String adresse;
	private String ville;
	private String codep;
	private String tel;
	private String numcarte;
	
	@JsonManagedReference
	@JsonIgnore
	@OneToMany (mappedBy = "panier" , fetch=FetchType.EAGER)
	private List<ListePanier> ListePanier = new ArrayList<> ();

		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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


	public String getCodep() {
		return codep;
	}


	public void setCodep(String codep) {
		this.codep = codep;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getNumcarte() {
		return numcarte;
	}



	public void setNumcarte(String numcarte) {
		this.numcarte = numcarte;
	}



	public List<ListePanier> getListePanier() {
		return ListePanier;
	}


	public void setListePanier(List<ListePanier> listePanier) {
		ListePanier = listePanier;
	}

// To String 
	@Override
	public String toString() {
		return "Panier [id=" + id + ", annee=" + annee + ", numero=" + numero + ", date=" + date + ", nom=" + nom
				+ ", adresse=" + adresse + ", ville=" + ville + ", codep=" + codep + ", tel=" + tel + ", numcarte="
				+ numcarte + ", ListePanier=" + ListePanier + "]";
	}



// Constructor with parameters 

	public Panier(Long id, int annee, int numero, Date date, String nom, String adresse, String ville, String codep,
			String tel, String numcarte, List<com.backend.ecommerce.admin.Model.ListePanier> listePanier) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.date = date;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.codep = codep;
		this.tel = tel;
		this.numcarte = numcarte;
		ListePanier = listePanier;
	}
	
	
	
	
	
	

}
