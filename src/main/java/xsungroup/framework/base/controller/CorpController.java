package xsungroup.framework.base.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xsungroup.framework.base.entity.CorpEntity;

/**
 * @Description: 公司信息Controller
 * @Author: kingJing
 * @Date: 2019/7/5 13:38
 **/
@Api(description = "公司信息管理-增删改查",tags = {"公司接口"})
@RestController
@RequestMapping("corp")
public class CorpController extends BaseController<CorpEntity>{
}
