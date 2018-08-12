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
        ReturnMsgVo<ProductInfo> tmpResult = new ReturnMsgVo<>();
        ProductInfo productInfo = productService.queryProductInfo(productId);
        if (productInfo != null) {
            tmpResult.setErrorMessage(null);
            tmpResult.setResponse(productInfo);
            tmpResult.setResult(true);
        } else {
            tmpResult.setErrorMessage(String.format("product: %s, get data failed", productId));
            tmpResult.setResponse(null);
            tmpResult.setResult(false);
        }
        return tmpResult;
    }
}
