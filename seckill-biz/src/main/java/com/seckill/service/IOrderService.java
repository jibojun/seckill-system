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
     * order check, determine where the seckill is successful
     *
     * @return
     */
    ReturnMsgVo OrderCheck(CreateOrderInput input);

    /**
     * create order for successful seckill, async, send message to kafka
     */
    ReturnMsgVo createOrder(CreateOrderInput input);


}
