package xsungroup.framework.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

/**
 * @description: 控制层异常处理类
 * @author: kingJing
 * @Date: 2019/7/8 15:55
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    private static final String logExceptionFormat = "全局异常捕获 GlobalExceptionHandler: Code: %s Detail: %s";
    private static Logger log = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * @description: 运行时异常
     * @author: kingJing
     * @date: 2019/7/8 16:15
     **/
    @ExceptionHandler(RuntimeException.class)
    public String runtimeExceptionHandler(RuntimeException ex) {
        return exceptionFormat(1, ex);
    }

    /**
     * @description: 空指针异常
     * @author: kingJing
     * @date: 2019/7/8 16:15
     **/
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler(NullPointerException ex) {
        return exceptionFormat(2, ex);
    }

    /**
     * @description: 类型转换异常
     * @author: kingJing
     * @date: 2019/7/8 16:18
     **/
    @ExceptionHandler(ClassCastException.class)
    public String classCastExceptionHandler(ClassCastException ex) {
        return exceptionFormat(3, ex);
    }

    /**
     * @description: IO异常
     * @author: kingJing
     * @date: 2019/7/8 16:18
     **/
    @ExceptionHandler(IOException.class)
    public String iOExceptionHandler(IOException ex) {
        return exceptionFormat(4, ex);
    }

    /**
     * 数组越界异常
     * @author: kingJing
     * @date: 2019/7/8 16:19
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        return exceptionFormat(5, ex);
    }

    /**
     * @description: 其他异常
     * @author: kingJing
     * @date: 2019/7/8 16:19
     **/
    @ExceptionHandler({Exception.class})
    public String exception(Exception ex) {
        return exceptionFormat(6, ex);
    }

    private <T extends Throwable> String exceptionFormat(Integer code, T ex) {
        log.error(String.format(logExceptionFormat, code, ex.getMessage()));
        return null;
    }


}
