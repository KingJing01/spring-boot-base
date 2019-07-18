package xsungroup.framework.base.exception;


import lombok.Data;

/**
 * @description: 自定义异常信息，方便前端信息统一处理
 * @author: kingJing 
 * @Date: 2019/7/18 15:21
 */
@Data
public class XsungroupException extends Exception {
    private static final long serialVersionUID = 1L;

    private String message;

    public XsungroupException(String message) {
        this.message = message;
    }
}
