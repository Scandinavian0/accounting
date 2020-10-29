package com.everglow.accounting.Exception;

import lombok.Data;

/**
 * @ClassName FramworkException
 * @Decripiton
 * @Author Everglow
 * @Date 2020/10/27 14:58
 * @Version 1.0
 **/
@Data
public class FrameworkException extends RuntimeException{
    private String msg;

    public FrameworkException(String msg){
        super(msg);
        this.msg = msg;
    }
}
