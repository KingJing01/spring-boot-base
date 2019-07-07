package xsungroup.framework.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xsungroup.framework.base.entity.UserEntity;

@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserEntity> {


}
