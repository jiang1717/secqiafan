package com.hxj.secqiafanproductservice;

import org.hxj.api.IProductService;
import org.hxj.entity.TProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SecqiafanProductServiceApplicationTests {

    @Autowired
    private IProductService productService;

    @Test
    public void contextLoads() {
        TProduct product = productService.getById(1001L);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }

}
