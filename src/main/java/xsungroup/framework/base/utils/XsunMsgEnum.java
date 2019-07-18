package xsungroup.framework.base.utils;

import lombok.Getter;

@Getter
public enum XsunMsgEnum {
    USER_UNIQUE(1,"用户名不能重复");
    // 编码
    private int code;
    // 消息信息
    private String message;

    XsunMsgEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
