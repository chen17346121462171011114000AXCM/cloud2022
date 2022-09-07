package com.cst.springcloud.controller;

import com.cst.springcloud.entities.CommonResult;
import com.cst.springcloud.entities.Payment;
import com.cst.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        if (result == 1){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
}
