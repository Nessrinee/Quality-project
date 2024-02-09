package com.backend.ecommerce.admin.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.backend.ecommerce.admin.Model.Product;
import com.backend.ecommerce.admin.Repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo ;
	
	  
	
	public List<Product> fetchProductList () {
		
		 return repo.findAll();	
	}

	public Product saveProduct (Product product) {
		
		return repo.save(product);
	}
		  
	  
	  // UPDATE Game 

	    private final ProductRepository productRepository;
	    
	    @Autowired
	    public ProductService(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }
	    
	    public Product updateProduct(Long id, Product product) {
	        Product existingProduct = productRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
	        existingProduct.setName(product.getName());
	        existingProduct.setDescription(product.getDescription());
	        existingProduct.setPrice(product.getPrice());
	        return productRepository.save(existingProduct);
	    }
		

	// DELETE GAME 
	    	    
	    public void deleteProduct(Long id) {
	        Product existingProduct = productRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
	        productRepository.delete(existingProduct);
	    }
}
