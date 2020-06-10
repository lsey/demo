package com.lsey.springcloud.controller;

import com.lsey.springcloud.entities.CommonResult;
import com.lsey.springcloud.entities.Payment;
import com.lsey.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author liangShuai
 * @Date 2020/6/10 14:04
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result=paymentService.createPayment(payment);

        if(result > 0) {
            log.info("*****插入数据成功："+payment);
            return new CommonResult(200,"插入数据成功");
        } else {
            log.info("*****插入数据失败");
            return new CommonResult(400,"插入数据失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment=paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);

        if(payment !=null) {
            return new CommonResult(200,"查询成功",payment);
        } else {
            return new CommonResult(400,"没有对应记录，查询ID:"+id);
        }
    }
}
