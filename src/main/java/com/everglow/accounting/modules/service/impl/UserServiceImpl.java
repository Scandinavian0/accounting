package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.User;
import com.everglow.accounting.modules.mapper.UserBaseMapper;
import com.everglow.accounting.modules.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserBaseMapper, User> implements IUserService {

}
