package com.simon.demo.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/610:07 上午
 */
@Data
public class OrderParam {
    private BigDecimal orderAmount;
    private String memo;
    private OrderGoodsParam orderGoodsParam;
}
