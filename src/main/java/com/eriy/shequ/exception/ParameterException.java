package com.eriy.shequ.exception;

/**
 * 参数异常
 *
 * @author sunny
 * @create 2017/11/27 14:20
 **/
public class ParameterException extends BusinessExcetion {

    public ParameterException(int code, String message) {
        super(code, message);
    }

    public ParameterException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
