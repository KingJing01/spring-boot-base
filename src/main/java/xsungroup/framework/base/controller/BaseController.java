package xsungroup.framework.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xsungroup.framework.base.service.BaseService;

/**
* @Description: 基础控制层封装
* @Author: kingJing
* @Date: 2019/7/5 13:38
**/
@Controller
public class BaseController<T>  {

    @Autowired
    private BaseService baseService;

    /**
     * 通用新增方法.
     * @param t
     */
    @PostMapping("/save")
    public void saveDate(@RequestBody T t){
        baseService.save(t);
    }

    /**
     * 通用删除方法
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteDate(@PathVariable String id){
        baseService.removeById(id);
    }



}
