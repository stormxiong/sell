package com.xpc.enums;

import lombok.Getter;

/**
 * Created by xpc on 2017/11/30.
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"上架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
