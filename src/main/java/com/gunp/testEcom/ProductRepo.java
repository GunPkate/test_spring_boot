package com.gunp.testEcom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
