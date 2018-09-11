package com.seckill.service;

import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.input.QueryOrderDetailInput;
import com.seckill.entity.vo.ReturnMsgVo;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/15_11:13 PM
 */
public interface IOrderService {
    /**
     * create order
     */
    ReturnMsgVo createOrder(CreateOrderInput input);

    /**
     * get order detail
     *
     * @return
     */
    ReturnMsgVo queryOrderDetail(QueryOrderDetailInput input);

}
