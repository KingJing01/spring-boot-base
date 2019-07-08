package xsungroup.framework.base.utils;

import lombok.Getter;

import java.sql.SQLException;

@Getter
public enum ExceptionEnum {
    RUNTIMEEXP(1, "运行时异常"),

    NullPointerExp(2,"空指针异常"),

    ClassCastExp(3,"类型转换异常"),

    IoExp(4,"IO异常"),

    OutBoundExp(5,"数组越界异常"),

    OtherException(6,"其他异常"),

    SQLExp(7,"数据库操作异常"),;

    // 编码
    private int code;
    // 消息信息
    private String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
