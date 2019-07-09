package xsungroup.framework.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xsungroup.framework.base.dao.UserDao;
import xsungroup.framework.base.entity.UserEntity;
import xsungroup.framework.base.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,UserEntity> implements UserService {
}
