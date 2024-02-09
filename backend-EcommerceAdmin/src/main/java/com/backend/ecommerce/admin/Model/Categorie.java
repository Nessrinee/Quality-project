package com.backend.ecommerce.admin.Model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table
public class Categorie {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name ;


@OneToMany(mappedBy = "categorieId")
private List<Produit> produits;




public List<Produit> getProduits() {
	return produits;
}
public void setProduits(List<Produit> produits) {
	this.produits = produits;
}
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



}
