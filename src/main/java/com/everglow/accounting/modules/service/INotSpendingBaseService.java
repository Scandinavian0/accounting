package com.everglow.accounting.modules.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.Map;
import com.everglow.accounting.modules.entity.NotSpending;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * <p>
 * 未消费表 服务类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
public interface INotSpendingBaseService extends IService<NotSpending> {
	/**
     *  查询(分页)
     */
    IPage<NotSpending> page(Page page, Map<String, Object> params);




}
