package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.User;
import com.everglow.accounting.modules.service.IUserBaseService;
import com.everglow.accounting.modules.mapper.UserBaseMapper;
import com.everglow.accounting.modules.service.IUserBaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.everglow.accounting.modules.entity.User;
import com.everglow.accounting.modules.mapper.UserBaseMapper;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Service
public class UserBaseServiceImpl extends ServiceImpl <UserBaseMapper, User> implements IUserBaseService {


    @Resource
    private IUserBaseService userBaseService;
    @Resource
    private UserBaseMapper userMapper;



    @Override
    public IPage<User> page(Page page, Map<String, Object> params) {
        return userMapper.page(page, params);
    }




}

