package com.xpc.VO;

import lombok.Data;

/**
 * Created by xpc on 2017/11/30.
 */
@Data
public class ResultVO<T> {

    private Integer code;//错误码

    private String msg;//提示信息

    private T data;//数据

}
