package xsungroup.framework.base.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 信息返回实体封装
 * @author: kingJing 
 * @Date: 2019/7/8 14:54
 */
@Data
public class ResponseInfo implements Serializable {

    private int flag;

    private String message;

    private Object data;
}
