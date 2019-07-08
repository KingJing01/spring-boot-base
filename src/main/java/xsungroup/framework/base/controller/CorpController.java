package xsungroup.framework.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xsungroup.framework.base.entity.CorpEntity;

/**
 * @Description: 公司信息测试
 * @Author: kingJing
 * @Date: 2019/7/5 13:38
 **/

@RestController
@RequestMapping("corp")
public class CorpController extends BaseController<CorpEntity>{
}
