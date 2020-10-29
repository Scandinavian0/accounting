package com.everglow.accounting.modules.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 总计表
 * </p>
 *
 * @author Everglow
 * @since 2020-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("amout")
@ApiModel(value="Amout对象", description="总计表")
public class Amout implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "总数")
    private Float amout;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


}
