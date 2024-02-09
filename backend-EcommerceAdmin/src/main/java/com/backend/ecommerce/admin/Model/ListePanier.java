package com.backend.ecommerce.admin.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListePanier")
public class ListePanier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int numero ; 
	private String code ;
	private String libelle;
	private double qte;
	private int TVA;
	private double monthtv; // montant hors tva
	private double monttva; //  montant avec tva
	private double montttc; //  montant avec ttc
	
	@ManyToOne (fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JsonBackReference 
	private Panier panier;
	
	

	// Getter & Setter 
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

	public double getQte() {
		return qte;
	}

	public void setQte(double qte) {
		this.qte = qte;
	}

	public int getTVA() {
		return TVA;
	}

	public void setTVA(int tVA) {
		TVA = tVA;
	}

	public double getMonthtv() {
		return monthtv;
	}

	public void setMonthtv(double monthtv) {
		this.monthtv = monthtv;
	}

	public double getMonttva() {
		return monttva;
	}

	public void setMonttva(double monttva) {
		this.monttva = monttva;
	}

	public double getMontttc() {
		return montttc;
	}

	public void setMontttc(double montttc) {
		this.montttc = montttc;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	// To String for test
	
		@Override
		public String toString() {
			return "ListePanier [id=" + id + ", numero=" + numero + ", code=" + code + ", libelle=" + libelle + ", qte="
					+ qte + ", TVA=" + TVA + ", monthtv=" + monthtv + ", monttva=" + monttva + ", montttc=" + montttc
					+ ", panier=" + panier + "]";
		}
	
	
	// Constructor 
	public ListePanier(long id, int numero, String code, String libelle, double qte, int tVA, double monthtv,
			double monttva, double montttc, Panier panier) {
		super();
		this.id = id;
		this.numero = numero;
		this.code = code;
		this.libelle = libelle;
		this.qte = qte;
		TVA = tVA;
		this.monthtv = monthtv;
		this.monttva = monttva;
		this.montttc = montttc;
		this.panier = panier;
	}
	
	
	

}
