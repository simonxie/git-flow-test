package com.simon.demo.service.impl;

import com.simon.demo.dto.OrderGoods;
import com.simon.demo.dto.OrderGoodsParam;
import com.simon.demo.dto.OrderMain;
import com.simon.demo.dto.OrderParam;
import com.simon.demo.service.CheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/610:21 上午
 */
@Slf4j
@Order(2)
@Service
public class CheckExistImpl implements CheckService {
    @Override
    public void check(OrderMain orderMain) {
        OrderParam orderParam = orderMain.getOrderParam();
        OrderGoodsParam orderGoodsParam = orderParam.getOrderGoodsParam();
        if (orderGoodsParam == null) {
            throw new RuntimeException("商品不存在，请确认");
        }
        OrderGoods orderGoods = orderMain.getOrderGoods();
        orderGoods.setGoodsId(orderGoodsParam.getGoodsId());
        orderGoods.setGoodsName("商品名称");
        orderGoods.setImgUrl("商品地址");
        orderGoods.setNum(orderGoodsParam.getNum());
        orderGoods.setPrice(orderGoodsParam.getPrice());

    }
}
