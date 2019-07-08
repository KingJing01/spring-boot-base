package xsungroup.framework.base.utils;

import lombok.Getter;

/**
 * @description: 返回信息的枚举封装
 * @author: kingJing
 * @Date: 2019/7/8 15:17
 */
@Getter
public enum ResultEnum {
    SUCCESS(0, "成功"),
    FAIL(1, "操作失败"),;
    // 编码
    private int code;
    // 消息信息
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
