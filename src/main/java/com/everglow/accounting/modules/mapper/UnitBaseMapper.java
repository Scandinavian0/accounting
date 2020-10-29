package com.everglow.accounting.modules.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Map;
import com.everglow.accounting.modules.entity.Unit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * <p>
 * 单位表 Mapper 接口
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
public interface UnitBaseMapper extends BaseMapper<Unit>{

    /**
     *  分页查询
     */
    IPage<Unit> page(Page<Unit> page,@Param("params")  Map<String, Object> params);



}
