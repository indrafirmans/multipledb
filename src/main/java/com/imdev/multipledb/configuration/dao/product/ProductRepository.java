package com.imdev.multipledb.configuration.dao.product;

import java.util.List;

import com.imdev.multipledb.configuration.dao.repository.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {


    List<Product> findAllByPrice(double price, Pageable pageable);
}
