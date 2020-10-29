package com.everglow.accounting.modules.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.Map;
import com.everglow.accounting.modules.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
public interface IUserBaseService extends IService<User> {
	/**
     *  查询(分页)
     */
    IPage<User> page(Page page, Map<String, Object> params);




}
