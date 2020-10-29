package com.everglow.accounting.modules.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.everglow.accounting.modules.service.IUserBaseService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Api(tags = {"User"}, description = "")
@RestController
@RequestMapping("/user")
public class UserBaseController{

    /**
     * 模块名称
     */
    private static final String MODEL = "|user";

    @Resource
    private IUserBaseService iuserService;

    @Resource
    private IUserBaseService userBaseService;









}
