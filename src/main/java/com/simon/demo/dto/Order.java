package com.simon.demo.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/610:08 上午
 */
@Data
public class Order {
    private BigDecimal orderAmount;
    private String memo;
}
