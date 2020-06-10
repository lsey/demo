package com.lsey.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author liangShuai
 * @Date 2020/6/10 10:36
 * @Version 1.0
 */
@Slf4j
@SpringBootApplication
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
        log.info("服务启动成功");
    }
}
