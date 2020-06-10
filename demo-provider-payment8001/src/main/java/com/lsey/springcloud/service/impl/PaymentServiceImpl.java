package com.lsey.springcloud.service.impl;

import com.lsey.springcloud.dao.PaymentDao;
import com.lsey.springcloud.entities.Payment;
import com.lsey.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author liangShuai
 * @Date 2020/6/10 12:07
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
