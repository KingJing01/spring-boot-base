package xsungroup.framework.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xsungroup.framework.base.dao.BaseDao;
import xsungroup.framework.base.service.BaseService;

public class BaseServiceImpl<M extends BaseDao<T>, T> extends ServiceImpl<M,T> implements BaseService<T> {
}
