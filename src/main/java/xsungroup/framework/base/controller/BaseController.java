package xsungroup.framework.base.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xsungroup.framework.base.dao.BaseDao;
import xsungroup.framework.base.utils.ResponseInfo;
import xsungroup.framework.base.utils.ResponseUtil;
import xsungroup.framework.base.utils.ResultEnum;

import java.util.List;
import java.util.Map;

/**
 * @Description: 基础控制层封装
 * @Author: kingJing
 * @Date: 2019/7/5 13:38
 **/
@Api
public class BaseController<T> {

    @Autowired
    private BaseDao<T> baseDao;
    private T t;

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

    @ApiOperation(value = "分页查询")
    @PostMapping("/list")
    public ResponseInfo pageData(@RequestBody T t) {
        Page<T> page = new Page<>(1,10);
        QueryWrapper<T> queryWrapper =  new QueryWrapper<>();
        IPage<T> data = baseDao.selectPage(page,queryWrapper);
        return new ResponseUtil().success(data);
    }

    @ApiOperation(value = "批量删除")
    @PostMapping("/deleteList")
    public ResponseInfo deletePatch(@RequestBody List<String> list){
        int result = baseDao.deleteBatchIds(list);
        return new ResponseUtil().success("");
    }


}
