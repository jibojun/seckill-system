package com.seckill.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/15_11:14 PM
 */
@RestController
public class OrderController {

    /**
     * create order
     *
     * @return
     */
    @RequestMapping("seckill/createOrder")
    public ReturnMsgVo createOrder() {
        return null;
    }

    /**
     * get create order result, other request sent by front end to get result
     *
     * @return
     */
    @RequestMapping("seckill/queryCreateOrderResult")
    public ReturnMsgVo queryCreateOrderResult() {
        return null;
    }

    /**
     * query item info
     *
     * @return
     */
    @RequestMapping("seckill/queryItem")
    public ReturnMsgVo queryItem() {
        return null;
    }
}
