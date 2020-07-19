package com.simon.demo.controller;

import com.simon.demo.dto.OrderMain;
import com.simon.demo.dto.OrderParam;
import com.simon.demo.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simon
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/69:57 上午
 */
@RestController
public class CheckController {

    @Autowired
    List<CheckService> checkServices;

    @PostMapping("check")
    public OrderMain check(@RequestBody OrderParam orderParam) {
        OrderMain orderMain = new OrderMain();
        orderMain.setOrderParam(orderParam);
        for (CheckService checkService : checkServices) {
            checkService.check(orderMain);
        }
        return orderMain;
    }
}
