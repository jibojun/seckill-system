package com.seckill.service;

import com.seckill.entity.vo.ReturnMsgVo;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_2:02 AM
 */
public interface QueryItem {
    ReturnMsgVo queryItem(long itemId);
}
