package com.backend.ecommerce.admin.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "listeVente")

public class Vente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int annee;
	private int numero;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd" , timezone="GMT")
	private Date date;
	private String nom;
	private String tel;
	
	@OneToMany(mappedBy = "vente" , fetch=FetchType.EAGER)
	
	private List<ListeVente> lventes = new ArrayList<>();
	
	

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

	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<ListeVente> getLventes() {
		return lventes;
	}



	public void setLventes(List<ListeVente> lventes) {
		this.lventes = lventes;
	}



	public Vente(Long id, int annee, int numero, Date date, String nom, String tel, List<ListeVente> lventes) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.date = date;
		this.nom = nom;
		this.tel = tel;
		this.lventes = lventes;
	}
	
	
}
