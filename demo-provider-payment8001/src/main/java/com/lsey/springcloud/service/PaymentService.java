package com.lsey.springcloud.service;

import com.lsey.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author liangShuai
 * @Date 2020/6/10 12:06
 * @Version 1.0
 */
public interface PaymentService {

    public int createPayment(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);
}
