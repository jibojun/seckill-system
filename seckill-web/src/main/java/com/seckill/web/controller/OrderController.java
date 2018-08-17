package com.seckill.web.controller;

import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.input.QueryOrderDetailInput;
import com.seckill.entity.vo.ReturnMsgVo;
import com.seckill.service.ProductService;
import com.seckill.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/15_11:14 PM
 */
@RestController
@RequestMapping("/seckill")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    /**
     * create order
     *
     * @return order id
     */
    @RequestMapping("createOrder")
    public ReturnMsgVo createOrder(@RequestBody CreateOrderInput createOrderInput) {
        return null;
    }

    /**
     * async, get create order result, other request sent by front end to get result based on order id
     *
     * @return create order result
     */
    @RequestMapping("queryOrderDetail")
    public ReturnMsgVo queryOrderDetail(@RequestBody QueryOrderDetailInput queryOrderDetailInput) {
        return null;
    }

    /**
     * query item info
     *
     * @return item basic info
     */
    @RequestMapping("queryItem")
    public ReturnMsgVo queryItem() {
        return null;
    }
}
