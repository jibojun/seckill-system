package com.seckill.entity.input;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_3:17 AM
 */
public class QueryOrderDetailInput extends BaseInput {
    private String orderId;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
