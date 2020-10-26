package com.everglow.accounting.modules.vo;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @ClassName Result
 * @Decripiton
 * @Author Everglow
 * @Date 2020/10/26 17:10
 * @Version 1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Result<T> {
    /**
     * 状态码
     */
    @ApiModelProperty("状态码")
    private final Integer code;
    /**
     * 消息
     */
    @ApiModelProperty("操作提示")
    private final String msg;
    /**
     * 数据内容，比如列表，实体
     */
    @ApiModelProperty("数据")
    private T data;

    public Result(String msg, Integer code) {
        this.code = code;
        this.msg = msg;
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
