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
@TableName("index_user_web")
@ApiModel(value="UserWeb对象", description="")
public class UserWeb implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自定义网站id")
      @TableId(value = "user_web_id", type = IdType.ID_WORKER_STR)
    private String userWebId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "网站名称")
    private String userWebName;

    @ApiModelProperty(value = "网站图标")
    private String userWebIcon;

    @ApiModelProperty(value = "网站url")
    private String userWebUrl;

    @ApiModelProperty(value = "网站分组tab")
    private String webGroupId;

    @ApiModelProperty(value = "排序")
    private Integer sort;


}
