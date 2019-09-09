package com.bawei.manager.repositories;

/**
 * @program: financial
 * @description:
 * @author: Mr.xue
 * @create: 2019-09-07 15:33
 **/
import com.bawei.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends
        JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {

}