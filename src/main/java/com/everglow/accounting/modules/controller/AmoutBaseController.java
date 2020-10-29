package com.everglow.accounting.modules.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.everglow.accounting.modules.service.IAmoutBaseService;

/**
 * <p>
 * 总计表 前端控制器
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Api(tags = {"Amout"}, description = "总计表")
@RestController
@RequestMapping("/amout")
public class AmoutBaseController{

    /**
     * 模块名称
     */
    private static final String MODEL = "总计表|amout";

    @Resource
    private IAmoutBaseService iamoutService;

    @Resource
    private IAmoutBaseService amoutBaseService;









}
