package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.BillDetails;
import com.everglow.accounting.modules.service.IBillDetailsBaseService;
import com.everglow.accounting.modules.mapper.BillDetailsBaseMapper;
import com.everglow.accounting.modules.service.IBillDetailsBaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.everglow.accounting.modules.entity.BillDetails;
import com.everglow.accounting.modules.mapper.BillDetailsBaseMapper;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/**
 * <p>
 * 账单表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Service
public class BillDetailsBaseServiceImpl extends ServiceImpl <BillDetailsBaseMapper, BillDetails> implements IBillDetailsBaseService {


    @Resource
    private IBillDetailsBaseService billDetailsBaseService;
    @Resource
    private BillDetailsBaseMapper billDetailsMapper;



    @Override
    public IPage<BillDetails> page(Page page, Map<String, Object> params) {
        return billDetailsMapper.page(page, params);
    }




}

