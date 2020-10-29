package com.everglow.accounting.modules.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.everglow.accounting.modules.service.INotSpendingBaseService;

/**
 * <p>
 * 未消费表 前端控制器
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Api(tags = {"NotSpending"}, description = "未消费表")
@RestController
@RequestMapping("/notSpending")
public class NotSpendingBaseController{

    /**
     * 模块名称
     */
    private static final String MODEL = "未消费表|notSpending";

    @Resource
    private INotSpendingBaseService inotSpendingService;

    @Resource
    private INotSpendingBaseService notSpendingBaseService;









}
