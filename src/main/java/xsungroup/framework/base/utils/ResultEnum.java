package xsungroup.framework.base.utils;

import lombok.Getter;

@Getter
public enum ResultEnum {
    success(0,"成功"),
    fail(1,"操作失败"),
    ;

    private int code;

    private String message;

    ResultEnum(int code,String message){
        this.code = code;
        this.message = message;
    }

}
