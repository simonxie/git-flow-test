package com.simon.demo.dto;

import lombok.Data;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/610:05 上午
 */
@Data
public class OrderGoods {
    private String goodsId;
    private String num;
    private String price;
    private String goodsName;
    private String imgUrl;
}
