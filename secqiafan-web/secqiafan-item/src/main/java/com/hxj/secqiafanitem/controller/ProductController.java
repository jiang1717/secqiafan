package com.hxj.secqiafanitem.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.hxj.api.IProductService;
import org.hxj.entity.TProduct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("product")
public class ProductController {

    @Reference
    private IProductService productService;

    @RequestMapping("getById/{id}")
    @ResponseBody
    public TProduct getById(@PathVariable("id") Long id){
        return productService.getById(id);
    }



}
