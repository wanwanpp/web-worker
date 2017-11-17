package com.wp.ioc;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
@Service
public class ProductService {

    @Autowired
    private CacheDb<String, Product> db;

    public Integer getAllProduct() {
        
    }

}
