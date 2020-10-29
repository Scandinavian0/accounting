package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.Unit;
import com.everglow.accounting.modules.service.IUnitBaseService;
import com.everglow.accounting.modules.mapper.UnitBaseMapper;
import com.everglow.accounting.modules.service.IUnitBaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.everglow.accounting.modules.entity.Unit;
import com.everglow.accounting.modules.mapper.UnitBaseMapper;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/**
 * <p>
 * 单位表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Service
public class UnitBaseServiceImpl extends ServiceImpl <UnitBaseMapper, Unit> implements IUnitBaseService {


    @Resource
    private IUnitBaseService unitBaseService;
    @Resource
    private UnitBaseMapper unitMapper;



    @Override
    public IPage<Unit> page(Page page, Map<String, Object> params) {
        return unitMapper.page(page, params);
    }




}

