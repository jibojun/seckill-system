package com.seckill.entity.input;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/8/17_11:08 PM
 */
public class QueryProductInput extends BaseInput{
    private long productId;


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
