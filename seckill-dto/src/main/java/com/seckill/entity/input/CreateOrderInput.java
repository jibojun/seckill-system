package com.seckill.entity.input;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_3:16 AM
 */
public class CreateOrderInput extends BaseInput {
    private String itemId;
    private int buyNumber;

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        try {
            return JSON.toJSONString(this);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return "";
    }
}
