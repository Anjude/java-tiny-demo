package xyz.anjude.encrypt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
@TableName("index_website")
@ApiModel(value="Website对象", description="")
public class Website implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "网站id")
      @TableId(value = "website_id", type = IdType.ID_WORKER_STR)
    private String websiteId;

    @ApiModelProperty(value = "网站url")
    private String websiteUrl;

    @ApiModelProperty(value = "网站名称")
    private String websiteName;

    @ApiModelProperty(value = "网站描述")
    private String websiteDescribe;

    @ApiModelProperty(value = "网站图标")
    private String websiteIcon;

    @ApiModelProperty(value = "网站默认选项卡，0（搜索引擎），1（官方默认我的应用），2（微意应用），3（学习中心应用），4（其他站点）")
    private String groupId;

    @ApiModelProperty(value = "网站标签")
    private String tagId;

    @ApiModelProperty(value = "网站收录时间")
    private Date createTime;


}
