package xsungroup.framework.base.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xsungroup.framework.base.entity.UserEntity;
@Api(tags={"用户接口"})
@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserEntity> {


}
