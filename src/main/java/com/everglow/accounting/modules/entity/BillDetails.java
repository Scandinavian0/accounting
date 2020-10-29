package com.everglow.accounting.modules.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 账单表
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bill_details")
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
