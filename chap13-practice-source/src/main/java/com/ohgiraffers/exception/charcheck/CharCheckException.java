package com.ohgiraffers.exception.charcheck;

public class CharCheckException extends Exception{
    public CharCheckException() {
    }

    public CharCheckException(String message) {
        super(message);

    }
    public CharCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharCheckException(Throwable cause) {
        super(cause);
    }

    public CharCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
