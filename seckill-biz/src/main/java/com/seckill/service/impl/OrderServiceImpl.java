package com.seckill.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.seckill.entity.input.CreateOrderInput;
import com.seckill.entity.vo.ReturnMsgVo;
import com.seckill.service.IOrderService;
import com.seckill.service.enumeration.ErrorCodeEnum;
import com.seckill.service.log.LogUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    @SuppressWarnings("unchecked")
    public ReturnMsgVo<Boolean> createOrder(CreateOrderInput input) {
        ReturnMsgVo tmpResult = ReturnMsgVo.createFailedResult(ErrorCodeEnum.PARAM_ERROR.getMessage());
        if (input == null || StringUtils.isEmpty(input.getItemId()) || input.getBuyNumber() == 0) {
            LogUtil.logError(this.getClass(), String.format("input check failed, input is: %s", input));
            return tmpResult;
        }
        boolean result = orderService.createOrder(input.getItemId(), input.getBuyNumber());
        tmpResult = ReturnMsgVo.createSuccessfulResult(result);
        LogUtil.logInfo(this.getClass(), "seckill, create order successfully");
        return tmpResult;
    }
}
