package com.simon.demo.dto;

import lombok.Data;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/610:04 上午
 */
@Data
public class OrderMain {
    private OrderParam orderParam;
    private Order order = new Order();
    private OrderGoods orderGoods = new OrderGoods();
}
