package com.lsey.springcloud.dao;

import com.lsey.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author liangShuai
 * @Date 2020/6/10 11:09
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    public int createPayment(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);

}
