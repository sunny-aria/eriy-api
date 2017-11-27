package com.eriy.shequ.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * 运行时异常
 * @author sunny
 * @create 2017/11/24 14:32
 **/
@Data
public class BusinessExcetion extends RuntimeException implements Serializable{

    private static final long serialVersionUID = -7808682322309808538L;
    private int code;

    public BusinessExcetion(int code,String message) {
        super(message);
        this.code=code;
    }


    public BusinessExcetion(int code,String message, Throwable cause) {
        super(message,cause);
        this.code=code;
    }


    public BusinessExcetion(Throwable cause) {
        super(cause);
    }

}
