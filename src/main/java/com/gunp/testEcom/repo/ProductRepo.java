package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
