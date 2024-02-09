package com.backend.ecommerce.admin.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ecommerce.admin.Model.Product;
import com.backend.ecommerce.admin.Repository.ProductRepository;
import com.backend.ecommerce.admin.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service ;
	
	// List of Product
	@RequestMapping (value = "/productList" , method = RequestMethod.GET)
	public List<Product> fetchProductList (){
		List<Product> products = new ArrayList<Product> ();
		// My Logic to fetch list from database
		products = service.fetchProductList();
		return products;
		
	}
	
	
	// Add Product 
	
	@RequestMapping (value = "/addproduct" , method = RequestMethod.POST)
	public ResponseEntity <Object>  saveProduct (@RequestBody Product product){
		
		Product saveProduct =  service.saveProduct(product);
		return new ResponseEntity<>("prodcut created successfully", HttpStatus.CREATED);
	}
	
	
	
	// UPDATE Product 
	@Autowired
	private ProductService productService ;
	    
	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }
	    
	    @PutMapping("/updateproduct/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
	        Product updatedProduct = productService.updateProduct(id, product);
	        return ResponseEntity.ok(updatedProduct);
	    }
	
	
	// DELETE Product	
		@DeleteMapping("/deleteproduct/{id}")
		public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {
		    productService.deleteProduct(id);
		    return new ResponseEntity<Object> ("Product is deleted successfully", HttpStatus.OK);
		}
}
	
