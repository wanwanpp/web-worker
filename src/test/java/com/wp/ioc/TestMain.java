package com.wp.ioc;

import com.wp.ioc.annotation.Autowired;
import org.junit.Test;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
public class TestMain {

    @Autowired
    private ProductService productService;

    @Test
    public void demo(){
        Product product1 = new Product("100","iphone 7",6000.00);
        Product product2 = new Product("101","vivo x20",3000.00);
        Product product3 = new Product("102","oppo r9",2500.00);
        productService.insertOne(product1);
        productService.insertOne(product2);
        productService.insertOne(product3);

        System.out.println(productService.getProductCount());

        productService.deleteOne("100");

        System.out.println(productService.getProductCount());

    }
}
