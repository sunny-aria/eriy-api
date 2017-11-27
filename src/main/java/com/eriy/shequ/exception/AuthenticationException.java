package com.eriy.shequ.exception;

import lombok.Data;

/**
 * 认证异常
 *
 * @author sunny
 * @create 2017/11/27 14:16
 **/
@Data
public class AuthenticationException extends BusinessExcetion {

    public AuthenticationException(int code, String message) {
        super(code, message);
    }

    public AuthenticationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
