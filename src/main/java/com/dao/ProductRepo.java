package com.dao;

import com.model.ProductModel;
//import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Product repo.
 */
public interface ProductRepo extends JpaRepository<ProductModel, Long> {

}
