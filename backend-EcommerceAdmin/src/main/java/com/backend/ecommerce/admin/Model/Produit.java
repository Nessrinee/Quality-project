package com.backend.ecommerce.admin.Model;


import java.math.BigDecimal;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="produit")

public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name="name" , length=20 )
	private String name ;
	
	@Column(name="description" , length=220 )
	private String description;
	
	@Column(name="prix" , length=20 , nullable=false)
	private BigDecimal prix ;
	
	@Column(name="stock" , length=20 , nullable=false)
	private int stock ;
	
	@Column(name="categorie" , length=20 , nullable=false)
	private String categorie;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="categorie_id")
	
	private Categorie categorieId; 
	

	// Constructor with out field 
	
	public Produit() {
		super();
	}
	
	
	
	
	
	// Constructor with field 	
	public Produit(Long id, String name, String description, BigDecimal prix, int stock, String categorie,
			Categorie categorieId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.prix = prix;
		this.stock = stock;
		this.categorie = categorie;
		this.categorieId = categorieId;
	}






	// Getter & Setter 
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getDescription() {
		return description;
	}






	public void setDescription(String description) {
		this.description = description;
	}






	public BigDecimal getPrix() {
		return prix;
	}






	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}






	public int getStock() {
		return stock;
	}






	public void setStock(int stock) {
		this.stock = stock;
	}






	public String getCategorie() {
		return categorie;
	}






	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}






	public Categorie getCategorieId() {
		return categorieId;
	}






	public void setCategorieId(Categorie categorieId) {
		this.categorieId = categorieId;
	}



	public void add(Produit produit) {
		// TODO Auto-generated method stub
		
	
	}
	
	



	public void remove(Produit produit) {
		// TODO Auto-generated method stub
		
	}
	
	
}

