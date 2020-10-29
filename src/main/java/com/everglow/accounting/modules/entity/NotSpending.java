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
 * 未消费表
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("not_spending")
@ApiModel(value="NotSpending对象", description="未消费表")
public class NotSpending implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "未消费内容")
    private String incident;

    @ApiModelProperty(value = "未消费数量")
    private Integer incidentNumber;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


}
