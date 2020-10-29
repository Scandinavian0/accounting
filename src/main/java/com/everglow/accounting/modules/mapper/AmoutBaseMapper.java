package com.everglow.accounting.modules.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Map;
import com.everglow.accounting.modules.entity.Amout;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * <p>
 * 总计表 Mapper 接口
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
public interface AmoutBaseMapper extends BaseMapper<Amout>{

    /**
     *  分页查询
     */
    IPage<Amout> page(Page<Amout> page,@Param("params")  Map<String, Object> params);



}
