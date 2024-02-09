package com.backend.ecommerce.admin.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.ecommerce.admin.Model.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {

	Optional<Product> findById(Long id);

	Product deleteById(Long id);

	/*Object getOne(Long id);*/
	


}
