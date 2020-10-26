package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.NotSpending;
import com.everglow.accounting.modules.mapper.NotSpendingBaseMapper;
import com.everglow.accounting.modules.service.INotSpendingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 未消费表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-22
 */
@Service
public class NotSpendingServiceImpl extends ServiceImpl<NotSpendingBaseMapper, NotSpending> implements INotSpendingService {

}
