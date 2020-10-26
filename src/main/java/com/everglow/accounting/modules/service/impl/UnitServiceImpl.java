package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.Unit;
import com.everglow.accounting.modules.mapper.UnitBaseMapper;
import com.everglow.accounting.modules.service.IUnitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单位表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-22
 */
@Service
public class UnitServiceImpl extends ServiceImpl<UnitBaseMapper, Unit> implements IUnitService {

}
