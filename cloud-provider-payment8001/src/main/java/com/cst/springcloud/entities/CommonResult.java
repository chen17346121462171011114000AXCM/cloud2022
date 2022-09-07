package com.cst.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;//状态码
    private String message;//具体描述信息
    private T data;//数据

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
