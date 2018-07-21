package com.seckill.entity.input;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_3:16 AM
 */
public class CreateOrderInput extends BaseInput {
    private long itemId;
    private int buyNumber;

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}
