package com.everglow.accounting.modules.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.everglow.accounting.modules.service.IUnitBaseService;

/**
 * <p>
 * 单位表 前端控制器
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Api(tags = {"Unit"}, description = "单位表")
@RestController
@RequestMapping("/unit")
public class UnitBaseController{

    /**
     * 模块名称
     */
    private static final String MODEL = "单位表|unit";

    @Resource
    private IUnitBaseService iunitService;

    @Resource
    private IUnitBaseService unitBaseService;









}
