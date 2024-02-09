package com.backend.ecommerce.admin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ecommerce.admin.Model.Panier;




@Repository
public interface PanierRepository extends JpaRepository <Panier , Long>{
	
	List<Panier> findAllByNom (String nom);
    
	
	
}
