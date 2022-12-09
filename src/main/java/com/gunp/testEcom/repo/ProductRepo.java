package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "Select * from product",nativeQuery = true)
    public List<Product> findAllProduct();


//    @Query("Select id, product,category  from product p where p.id = :id")
//    public List<Product> findProductByID(@Param("id") long id);

//    String DELETE_product = "delete from product where id = :id";
//    @Modifying
//    @Query(DELETE_product)
//    public void deleteProduct(@Param("id") long id);

//   @Query("update product p set p.id = :id ")
//    public void updateProductByID(@Param("id") long id);
}
