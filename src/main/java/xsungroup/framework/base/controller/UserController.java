package xsungroup.framework.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xsungroup.framework.base.entity.UserEntity;
import xsungroup.framework.base.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void add(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
    }
}
