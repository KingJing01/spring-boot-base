package xsungroup.framework.base.utils;

/**
 * @description: 返回消息对象封装
 * @author: kingJing 
 * @Date: 2019/7/8 15:23
 */
public class ResponseUtil {
    /**
     * @description: 返回成功消息体
     * @param: Object 获取的数据
     * @return: ResponseInfo
     * @author: kingJing
     * @date: 2019/7/8 15:26
     **/
    public ResponseInfo success(Object object) {
        ResponseInfo respInfo = new ResponseInfo();
        respInfo.setFlag(ResultEnum.SUCCESS.getCode());
        respInfo.setData(object);
        respInfo.setMessage(ResultEnum.SUCCESS.getMessage());
        return respInfo;
    }

    /**
     * @description: 返回错误信息消息体
     * @param: messge 消息信息
     * @return: ResponseInfo
     * @author: kingJing
     * @date: 2019/7/8 15:30
     **/
    public ResponseInfo fail(String messge) {
        ResponseInfo respInfo = new ResponseInfo();
        respInfo.setFlag(ResultEnum.FAIL.getCode());
        respInfo.setMessage(messge);
        return respInfo;
    }
}
