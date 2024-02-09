package com.backend.ecommerce.admin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.backend.ecommerce.admin.Model.Produit;
import com.backend.ecommerce.admin.Repository.ProduitRepository;

@Service
public class ProduitService {
	
	 @Autowired
	    private static ProduitRepository ProduitRepository;
	    
	    public Produit addProduct(Produit produit) {
	        List<Produit> Produits = ProduitRepository.findAll();
	        produit.add(produit);
	        ProduitRepository.saveAll(Produits);
	        return produit;
	    }

		public static Produit addProduit(Produit produit) {
			// TODO Auto-generated method stub
			return null;
		}
	 
		
		
		@Autowired
	    private ProduitRepository produitRepository;
	    
	  

		/*private static Object findById(Object produitId) {
			// TODO Auto-generated method stub
			return null;
		}*/

		// Delete
		public void deleteProduit(Object produitId) {
			 Produit existingProduit = produitRepository.findAllById(produitId).orElseThrow(() -> new ResourceNotFoundException());
		        
		        produitRepository.delete(existingProduit);
			
		}

		

		/*public Optional<Produit> getProduits(Long id) {
			// TODO Auto-generated method stub
			return null;
		}*/

		public Optional<Produit> getProduit(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		
			
		}	
	
