package com.backend.ecommerce.admin.Model;

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
@Table (name ="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name" , length=20 )
	private String name;
	
	@Column(name="description" , length=20 )
	private String description;
	
	@Column(name="price" , length=20 )
	private int price ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="categorie_id")
	
	private Categorie categorieId; 
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Product(Long id, String name, String description, int price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
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




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", categorieId=" + categorieId + "]";
	}




	







	
	

}



