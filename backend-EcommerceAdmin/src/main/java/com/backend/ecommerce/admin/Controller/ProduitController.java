package com.backend.ecommerce.admin.Controller;
import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ecommerce.admin.Model.Categorie;
import com.backend.ecommerce.admin.Model.Produit;
import com.backend.ecommerce.admin.Service.ProduitService;




@RestController
public class ProduitController {
 
	// CREATE Product "creation is done "
	@RequestMapping (value="/produits" , method = RequestMethod.POST)
	public ResponseEntity<String> addproduit(@RequestBody Produit produit) {
        Produit addProduit = ProduitService.addProduit(produit);
        return new ResponseEntity<>("produit created successfully", HttpStatus.CREATED);
    }
	
	
	// UPDATE Product
	@RequestMapping(value="/produits/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateProduit(@PathVariable ("id")Long id){
		Optional<Produit> produit=produitService.getProduit(id);
		
		if(produit != null && produit.isPresent ()) {
			String Name = produit.get().getName();
			BigDecimal Prix = produit.get().getPrix();
			int Stock = produit.get().getStock();
			String categorie = produit.get().getCategorie();
			return new ResponseEntity<>("Produit is updated successfully", HttpStatus.OK);
		}
		return new ResponseEntity <>("Failed: Produit not found", HttpStatus.NOT_FOUND);
	}
	
			
	// DELETE PRODUCT 
	@Autowired
    private ProduitService produitService;
	
	@RequestMapping(value = "/produits/{id}" , method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduit(@PathVariable ("id") Long id){
		Optional<Produit> produit=produitService.getProduit(id);
		
		if (produit != null && produit.isPresent()) {
			produitService.deleteProduit(produit.get().getId());
			return new ResponseEntity<>("Person is deleted successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Failed: Produit not found" , HttpStatus.NOT_FOUND);
	}

}
