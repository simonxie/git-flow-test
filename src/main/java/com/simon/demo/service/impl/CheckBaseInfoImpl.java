package com.simon.demo.service.impl;

import com.simon.demo.dto.Order;
import com.simon.demo.dto.OrderMain;
import com.simon.demo.dto.OrderParam;
import com.simon.demo.service.CheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/610:19 上午
 */
@Service
@org.springframework.core.annotation.Order(1)
@Slf4j
public class CheckBaseInfoImpl implements CheckService {
    @Override
    public void check(OrderMain orderMain) {
        OrderParam orderParam = orderMain.getOrderParam();
        if (orderParam.getOrderAmount() == null) {
            throw new RuntimeException("订单金额不能为空");
        }
        Order order = orderMain.getOrder();
        order.setMemo(orderParam.getMemo());
        order.setOrderAmount(orderParam.getOrderAmount());
    }
}
