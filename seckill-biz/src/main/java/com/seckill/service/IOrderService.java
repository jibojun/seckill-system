package com.seckill.service;

import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.vo.ReturnMsgVo;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/15_11:13 PM
 */
public interface IOrderService {

    /**
     * create order and get result
     */
    ReturnMsgVo createOrder(CreateOrderInput input);


}
