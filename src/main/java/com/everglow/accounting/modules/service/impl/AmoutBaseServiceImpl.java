package com.everglow.accounting.modules.service.impl;

import com.everglow.accounting.modules.entity.Amout;
import com.everglow.accounting.modules.service.IAmoutBaseService;
import com.everglow.accounting.modules.mapper.AmoutBaseMapper;
import com.everglow.accounting.modules.service.IAmoutBaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.everglow.accounting.modules.entity.Amout;
import com.everglow.accounting.modules.mapper.AmoutBaseMapper;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/**
 * <p>
 * 总计表 服务实现类
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Service
public class AmoutBaseServiceImpl extends ServiceImpl <AmoutBaseMapper, Amout> implements IAmoutBaseService {


    @Resource
    private IAmoutBaseService amoutBaseService;
    @Resource
    private AmoutBaseMapper amoutMapper;



    @Override
    public IPage<Amout> page(Page page, Map<String, Object> params) {
        return amoutMapper.page(page, params);
    }




}

