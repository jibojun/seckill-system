package com.seckill.entity.input;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/8/17_11:08 PM
 */
public class QueryProductInput extends BaseInput {
    @JSONField(name = "productId")
    private long productId;


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
