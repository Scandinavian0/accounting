package com.everglow.accounting.modules.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.Map;
import com.everglow.accounting.modules.entity.Amout;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * <p>
 * 总计表 服务类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
public interface IAmoutBaseService extends IService<Amout> {
	/**
     *  查询(分页)
     */
    IPage<Amout> page(Page page, Map<String, Object> params);




}
