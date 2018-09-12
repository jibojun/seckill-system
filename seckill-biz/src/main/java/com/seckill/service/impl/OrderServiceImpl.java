package com.seckill.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.vo.ReturnMsgVo;
import com.seckill.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_2:01 AM
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Reference
    private com.seckill.service.backend.api.IOrderService orderService;

    @Override
    public ReturnMsgVo createOrder(CreateOrderInput input) {
        ReturnMsgVo
        orderService.createOrder()
        return null;
    }
}
