package com.seckill.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.seckill.entity.vo.ReturnMsgVo;
import com.seckill.service.ProductService;
import com.seckill.service.backend.api.IProductService;
import com.seckill.service.backend.api.ProductInfo;
import org.springframework.stereotype.Service;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/8/12_1:19 AM
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Reference
    private IProductService productService;

    /**
     * get product info from service interface
     *
     * @param productId
     * @return
     */
    @Override
    public ReturnMsgVo queryProduct(long productId) {
        ProductInfo productInfo = productService.queryProductInfo(productId);
        return null;
    }
}
