package com.seckill.service;

import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.input.QueryCreateOrderResultInput;
import com.seckill.entity.vo.ReturnMsgVo;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/15_11:13 PM
 */
public interface CreateOrder {
    /**
     * create order
     */
    ReturnMsgVo createOrder(CreateOrderInput input);

    /**
     * get result of order creating
     *
     * @return
     */
    ReturnMsgVo getCreateOrderResult(QueryCreateOrderResultInput input);

}
