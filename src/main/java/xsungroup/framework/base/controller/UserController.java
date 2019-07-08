package xsungroup.framework.base.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xsungroup.framework.base.entity.UserEntity;
@Api(description = "用户信息管理-增删改查",tags={"用户接口"})
@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserEntity> {


}
