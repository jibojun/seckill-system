package com.seckill.service.impl;

import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.input.QueryOrderDetailInput;
import com.seckill.entity.vo.ReturnMsgVo;
import com.seckill.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_2:01 AM
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public ReturnMsgVo createOrder(CreateOrderInput input) {
        return null;
    }

    @Override
    public ReturnMsgVo queryOrderDetail(QueryOrderDetailInput input) {
        return null;
    }
}
