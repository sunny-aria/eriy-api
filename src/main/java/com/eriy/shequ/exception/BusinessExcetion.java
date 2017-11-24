package com.eriy.shequ.exception;

/**
 * 运行时异常
 * @author sunny
 * @create 2017/11/24 14:32
 **/
public class BusinessExcetion extends RuntimeException{
    private String code;

    public BusinessExcetion(String code,String message) {
        super(message);
        this.code=code;
    }


    public BusinessExcetion(String code,String message, Throwable cause) {
        super(message,cause);
        this.code=code;
    }


    public BusinessExcetion(Throwable cause) {
        super(cause);
    }

}
