package com.backend.ecommerce.admin.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ecommerce.admin.Model.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur , Long>{
	
	List<Fournisseur> findAllByLibelleContaining(String libelle);
	
	Optional<Fournisseur> findByCode(int id);
	
	List <Fournisseur> findAllByEmail(String email);
	

}
