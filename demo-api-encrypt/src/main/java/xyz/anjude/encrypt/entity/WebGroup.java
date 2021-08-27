package xyz.anjude.encrypt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author anjude
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("index_web_group")
@ApiModel(value="WebGroup对象", description="")
public class WebGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "选项卡id")
      @TableId(value = "web_group_id", type = IdType.ID_WORKER_STR)
    private String webGroupId;

    @ApiModelProperty(value = "选项卡名称")
    private String webGroupName;

    @ApiModelProperty(value = "选项卡图标")
    private String webGroupIcon;

    @ApiModelProperty(value = "选项卡类型，0（默认选项卡，不可删除），1（用户自定义选项卡）")
    private Integer webGroupType;

    @ApiModelProperty(value = "选项卡所属用户id")
    private String userId;

    @ApiModelProperty(value = "选项卡排序序号")
    private Integer sort;


}
