package com.eriy.shequ.exception;

import lombok.Data;

/**
 * 权限异常
 *
 * @author sunny
 * @create 2017/11/27 14:19
 **/
@Data
public class AuthorizationException extends BusinessExcetion {

    public AuthorizationException(int code, String message) {
        super(code, message);
    }

    public AuthorizationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
