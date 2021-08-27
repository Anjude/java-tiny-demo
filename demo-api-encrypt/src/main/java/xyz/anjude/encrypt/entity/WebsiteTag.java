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
@TableName("index_website_tag")
@ApiModel(value="WebsiteTag对象", description="")
public class WebsiteTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签id")
      @TableId(value = "tag_id", type = IdType.ID_WORKER_STR)
    private String tagId;

    @ApiModelProperty(value = "标签名称")
    private String tagName;

    @ApiModelProperty(value = "父标签id（暂时不做）")
    private String parentTagId;

    @ApiModelProperty(value = "标签图标")
    private String tagIcon;

    @ApiModelProperty(value = "标签层级（暂时不做）")
    private Integer tagLevel;

    @ApiModelProperty(value = "排序")
    private Integer sort;


}
