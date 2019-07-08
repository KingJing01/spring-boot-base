package xsungroup.framework.base.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xsungroup.framework.base.dao.BaseDao;
import xsungroup.framework.base.utils.ResponseInfo;
import xsungroup.framework.base.utils.ResponseUtil;
import xsungroup.framework.base.utils.ResultEnum;

/**
 * @Description: 基础控制层封装
 * @Author: kingJing
 * @Date: 2019/7/5 13:38
 **/
@Api
public class BaseController<T> {

    @Autowired
    private BaseDao<T> baseDao;

    /**
     * 通用新增方法.
     *
     * @param t
     */
    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public ResponseInfo saveData(@RequestBody T t){
        int result = baseDao.insert(t);
        return result > 0 ? new ResponseUtil().success("") : new ResponseUtil().error(ResultEnum.FAIL.getMessage());
    }

    /**
     * 通用删除方法
     *
     * @param id
     */
    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id", value = "主键ID", required = true, dataType = "String")
    @DeleteMapping("/{id}")
    public ResponseInfo deleteData(@PathVariable String id){
        baseDao.deleteById(id);
        return  new ResponseUtil().success("");
    }


}
