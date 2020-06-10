package com.lsey.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author liangShuai
 * @Date 2020/6/10 15:54
 * @Version 1.0
 */
@SpringBootApplication
@Slf4j
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
        log.info("服务启动成功");
    }
}
