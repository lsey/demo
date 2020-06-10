package com.lsey.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author liangShuai
 * @Date 2020/6/10 10:52
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public  CommonResult(Integer code,String message) {
        this(code,message,null);
    }
}
