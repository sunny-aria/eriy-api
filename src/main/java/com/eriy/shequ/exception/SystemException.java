package com.eriy.shequ.exception;

/**
 * 系统异常
 *
 * @author sunny
 * @create 2017/11/27 14:22
 **/
public class SystemException extends BusinessExcetion {

    public SystemException(int code, String message) {
        super(code, message);
    }

    public SystemException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
