package com.simon.demo.service.impl;

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
 * @date 2020/6/610:20 上午
 */
@Slf4j
@Order(3)
@Service
public class CheckPriceImpl implements CheckService {
    @Override
    public void check(OrderMain orderMain) {
        OrderParam orderParam = orderMain.getOrderParam();
        OrderGoodsParam orderGoodsParam = orderParam.getOrderGoodsParam();
        if ("-1".equals(orderGoodsParam.getPrice())) {
            throw new RuntimeException("价格没找到");
        }
    }
}
