package com.everglow.accounting.modules.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.everglow.accounting.modules.service.IBillDetailsBaseService;

/**
 * <p>
 * 账单表 前端控制器
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Api(tags = {"BillDetails"}, description = "账单表")
@RestController
@RequestMapping("/billDetails")
public class BillDetailsBaseController{

    /**
     * 模块名称
     */
    private static final String MODEL = "账单表|billDetails";

    @Resource
    private IBillDetailsBaseService ibillDetailsService;

    @Resource
    private IBillDetailsBaseService billDetailsBaseService;









}
