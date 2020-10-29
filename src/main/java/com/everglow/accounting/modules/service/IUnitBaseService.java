package com.everglow.accounting.modules.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.Map;
import com.everglow.accounting.modules.entity.Unit;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * <p>
 * 单位表 服务类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
public interface IUnitBaseService extends IService<Unit> {
	/**
     *  查询(分页)
     */
    IPage<Unit> page(Page page, Map<String, Object> params);




}
