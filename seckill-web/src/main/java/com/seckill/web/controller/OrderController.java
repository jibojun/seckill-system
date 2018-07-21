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
public class OrderController {

    /**
     * create order
     *
     * @return request id
     */
    @RequestMapping("seckill/createOrder")
    public ReturnMsgVo createOrder() {
        return null;
    }

    /**
     * async, get create order result, other request sent by front end to get result based on order id
     *
     * @return create order result
     */
    @RequestMapping("seckill/queryCreateOrderResult")
    public ReturnMsgVo queryCreateOrderResult() {
        return null;
    }

    /**
     * query item info
     *
     * @return item basic info
     */
    @RequestMapping("seckill/queryItem")
    public ReturnMsgVo queryItem() {
        return null;
    }
}
