package com.everglow.accounting.framework.config.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.everglow.accounting.Exception.FrameworkException;
import com.everglow.accounting.modules.entity.User;
import com.everglow.accounting.modules.mapper.UserBaseMapper;
import com.everglow.accounting.modules.vo.SecurityUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName UserDeatils
 * @Decripiton 用户信息自定义
 * @Author Everglow
 * @Date 2020/10/27 14:39
 * @Version 1.0
 **/
@Service("UserDetailsServiceImpl")
@Transactional(rollbackFor = Exception.class)
public class UserDeatils implements UserDetailsService {
    @Resource
    private UserBaseMapper userBaseMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userBaseMapper.selectOne(new QueryWrapper<User>().eq("username", username));
        if (user != null) {
            return new SecurityUserDetails(new User()
                    .setUsername(username)
                    .setPassword(user.getPassword()));
        } else {
            throw new FrameworkException("登录错误");
        }
    }
}
