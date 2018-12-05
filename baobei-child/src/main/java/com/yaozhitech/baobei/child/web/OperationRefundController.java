package com.yaozhitech.baobei.child.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaozhitech.baobei.child.service.second.OperationRefundService;

/**
 * 退款记录表-Controller类
 * @author jiangjialiang on 2018/11/05
 * @version 1.0.0
 */
@Controller
@RequestMapping("/operationRefund")
public class OperationRefundController {

    @Resource
    private OperationRefundService operationRefundService;

    @RequestMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
       operationRefundService.list(page, size);
    }
}
