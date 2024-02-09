package com.backend.ecommerce.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ecommerce.admin.Model.ListePanier;

@Repository
public interface ListePanierRepository extends JpaRepository<ListePanier , Long>{
	

}
