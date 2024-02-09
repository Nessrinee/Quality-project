package com.backend.ecommerce.admin.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ecommerce.admin.Model.Produit;



@Repository
public interface ProduitRepository extends JpaRepository <Produit , Long>{
	
	Optional<Produit> findAllById(Object produitId);
	Optional<Produit> findById(Produit produitId);

	
	
}
