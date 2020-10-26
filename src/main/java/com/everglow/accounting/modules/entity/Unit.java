package com.everglow.accounting.modules.entity;


import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 单位表
 * </p>
 *
 * @author Everglow
 * @since 2020-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Unit对象", description="单位表")
public class Unit implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记账名称")
    private String unitName;

    @ApiModelProperty(value = "等价与冰糕个数")
    private Float unitNumber;


}
