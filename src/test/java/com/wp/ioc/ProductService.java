package com.wp.ioc;

import com.wp.ioc.annotation.Autowired;
import com.wp.ioc.annotation.Service;
import com.wp.ioc.annotation.Value;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
@Service
public class ProductService {

    @Autowired
    private ProductDb productDb;

    @Value("12345")
    private String test;

    public Integer getProductCount() {
        return productDb.count();
    }

    public Product selectOne(String id) {
        return productDb.select(id);
    }

    public void deleteOne(String id) {
        productDb.delete(id);
    }

    public void insertOne(Product product) {
        productDb.insert(product.getId(), product);
    }
}
