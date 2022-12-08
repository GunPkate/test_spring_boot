package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "Select * from product",nativeQuery = true)
    public List<Product> findAllProduct();

    //    @Query("Select p from product p")
//    public List<Product> findProductByID(@Param("id") long id);
}
