package com.seckill.web.controller;

import com.seckill.entity.vo.ReturnMsgVo;
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

    /**
     * create order
     *
     * @return request id
     */
    @RequestMapping("/createOrder")
    public ReturnMsgVo createOrder() {
        return null;
    }

    /**
     * async, get create order result, other request sent by front end to get result based on order id
     *
     * @return create order result
     */
    @RequestMapping("/queryOrderDetail")
    public ReturnMsgVo queryOrderDetail() {
        return null;
    }

    /**
     * query item info
     *
     * @return item basic info
     */
    @RequestMapping("/queryItem")
    public ReturnMsgVo queryItem() {
        return null;
    }
}
