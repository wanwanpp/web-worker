package com.wp.ioc;

import com.wp.ioc.annotation.Component;

/**
 * Created by 王萍 on 2017/11/17 0017.
 */
@Component("productDb")
public class ProductDb extends CacheDb<String,Product> {


}
