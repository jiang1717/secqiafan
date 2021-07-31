package com.hxj.secqiafanproductservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.hxj.api.IProductService;
import org.hxj.base.BaseServiceImpl;
import org.hxj.base.IBaseDao;
import org.hxj.entity.TProduct;
import org.hxj.mapper.TProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 93651
 */
@Service
public class ProuductServiceImpl implements IProductService {

    @Autowired
    private TProductMapper productMapper;


    @Override
    public TProduct getById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
