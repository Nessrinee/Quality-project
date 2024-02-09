package com.backend.ecommerce.admin.Model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lvente")

public class ListeVente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private int numero;
	private String code ;
	private String libelle;
	private double mois;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	private Vente vente;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getMois() {
		return mois;
	}

	public void setMois(double mois) {
		this.mois = mois;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	@Override
	public String toString() {
		return "ListeVente [id=" + id + ", numero=" + numero + ", code=" + code + ", libelle=" + libelle + ", mois="
				+ mois + ", vente=" + vente + "]";
	}

	public ListeVente(long id, int numero, String code, String libelle, double mois, Vente vente) {
		super();
		this.id = id;
		this.numero = numero;
		this.code = code;
		this.libelle = libelle;
		this.mois = mois;
		this.vente = vente;
	}
	
	

}
