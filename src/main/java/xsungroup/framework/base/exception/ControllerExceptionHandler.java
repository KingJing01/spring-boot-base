package xsungroup.framework.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xsungroup.framework.base.utils.ResponseInfo;
import xsungroup.framework.base.utils.ResponseUtil;
import xsungroup.framework.base.utils.ResultEnum;

import java.io.IOException;
import java.sql.SQLSyntaxErrorException;

/**
 * @description: 控制层异常处理类
 * @author: kingJing
 * @Date: 2019/7/8 15:55
 */
@RestControllerAdvice
public class ControllerExceptionHandler {
    private static final String logExceptionFormat = "全局异常捕获 ControllerExceptionHandler: Code: %s Detail: %s";
    private static Logger log = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * @description: 运行时异常
     * @author: kingJing
     * @date: 2019/7/8 16:15
     **/
    @ExceptionHandler(RuntimeException.class)
    public ResponseInfo runtimeExceptionHandler(RuntimeException ex) {
        return exceptionFormat(1, ex);
    }

    /**
     * @description: 空指针异常
     * @author: kingJing
     * @date: 2019/7/8 16:15
     **/
    @ExceptionHandler(NullPointerException.class)
    public ResponseInfo nullPointerExceptionHandler(NullPointerException ex) {
        return exceptionFormat(2, ex);
    }

    /**
     * @description: 类型转换异常
     * @author: kingJing
     * @date: 2019/7/8 16:18
     **/
    @ExceptionHandler(ClassCastException.class)
    public ResponseInfo classCastExceptionHandler(ClassCastException ex) {
        return exceptionFormat(3, ex);
    }

    /**
     * @description: IO异常
     * @author: kingJing
     * @date: 2019/7/8 16:18
     **/
    @ExceptionHandler(IOException.class)
    public ResponseInfo iOExceptionHandler(IOException ex) {
        return exceptionFormat(4, ex);
    }

    /**
     * 数组越界异常
     *
     * @author: kingJing
     * @date: 2019/7/8 16:19
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseInfo indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        return exceptionFormat(5, ex);
    }

    /**
     * @description: 其他异常
     * @author: kingJing
     * @date: 2019/7/8 16:19
     **/
    @ExceptionHandler({Exception.class})
    public ResponseInfo exception(Exception ex) {
        return exceptionFormat(6, ex);
    }

    /**
     * 数据库异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(SQLSyntaxErrorException.class)
    public ResponseInfo SQLSyntaxErrorException(SQLSyntaxErrorException ex) {
        return exceptionFormat(7, ex);
    }
    
    /**
     * @description: 自定义异常处理方法 注：101 特殊编码
     * @param:  异常类
     * @return: ResponseInfo
     * @author: kingJing
     * @date: 2019/7/18 15:50
     **/
    @ExceptionHandler(XsungroupException.class)
    public ResponseInfo XsungroupException(XsungroupException ex) {
        return exceptionFormat(101, ex);
    }

    /**
     * @description: 异常信息输出并统一处理
     * @param: 错误编码
     * @return: string
     * @author: kingJing
     * @date: 2019/7/8 16:23
     **/
    private <T extends Throwable> ResponseInfo exceptionFormat(Integer code, T ex) {
        log.error(String.format(logExceptionFormat, code, ex.getMessage()));
        if (101 == code.intValue()) {
            return new ResponseUtil().error(ex.getMessage());
        } else {
            return new ResponseUtil().error(ResultEnum.FAIL.getMessage());
        }

    }


}
