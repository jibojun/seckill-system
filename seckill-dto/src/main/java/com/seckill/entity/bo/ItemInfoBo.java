package com.seckill.entity.bo;

import java.math.BigDecimal;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_2:04 AM
 */
public class ItemInfoBo {
    private String name;
    private BigDecimal price;
    private long quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
