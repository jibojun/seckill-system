package com.seckill.service;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/15_11:13 PM
 */
public interface CreateOrder {
    /**
     * create order
     */
    void createOrder();

    /**
     * get result of order creating
     *
     * @return
     */
    ReturnMsgVo getCreateOrderResult();

}
