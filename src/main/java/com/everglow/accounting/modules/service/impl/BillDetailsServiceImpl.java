package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.BillDetails;
import com.everglow.accounting.modules.mapper.BillDetailsBaseMapper;
import com.everglow.accounting.modules.service.IBillDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账单表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-22
 */
@Service
public class BillDetailsServiceImpl extends ServiceImpl<BillDetailsBaseMapper, BillDetails> implements IBillDetailsService {

}
