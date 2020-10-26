package com.everglow.accounting.modules.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 账单表
 * </p>
 *
 * @author Everglow
 * @since 2020-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="BillDetails对象", description="账单表")
public class BillDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单价表id")
    private Integer unitId;

    @ApiModelProperty(value = "单价表抵冰糕个数")
    private Float unitNumber;

    @ApiModelProperty(value = "抵扣事件")
    private String billDetails;

    @ApiModelProperty(value = "当前总数")
    private Float total;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


}
