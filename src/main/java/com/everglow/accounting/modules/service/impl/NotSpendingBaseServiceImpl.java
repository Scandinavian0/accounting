package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.NotSpending;
import com.everglow.accounting.modules.service.INotSpendingBaseService;
import com.everglow.accounting.modules.mapper.NotSpendingBaseMapper;
import com.everglow.accounting.modules.service.INotSpendingBaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.everglow.accounting.modules.entity.NotSpending;
import com.everglow.accounting.modules.mapper.NotSpendingBaseMapper;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/**
 * <p>
 * 未消费表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Service
public class NotSpendingBaseServiceImpl extends ServiceImpl <NotSpendingBaseMapper, NotSpending> implements INotSpendingBaseService {


    @Resource
    private INotSpendingBaseService notSpendingBaseService;
    @Resource
    private NotSpendingBaseMapper notSpendingMapper;



    @Override
    public IPage<NotSpending> page(Page page, Map<String, Object> params) {
        return notSpendingMapper.page(page, params);
    }




}

