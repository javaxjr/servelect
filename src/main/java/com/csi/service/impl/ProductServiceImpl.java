package com.csi.service.impl;

import com.csi.domain.Product;
import com.csi.service.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> list() {
        List<Product> products = new ArrayList<>() ;

        Product product = new Product() ;
        product.setProductNo("110001121545");
        product.setProductName("统一方便面");
        product.setProductDesc("这是超级方便面，超级好吃，超级味道，超级便宜，仅需一元");
        product.setProductWeight(125);
        product.setProductPrice(new BigDecimal(1.5));

        products.add(product) ;

        return products;
    }
}
