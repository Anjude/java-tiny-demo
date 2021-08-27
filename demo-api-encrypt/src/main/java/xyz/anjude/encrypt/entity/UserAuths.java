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
@TableName("index_user_auths")
@ApiModel(value="UserAuths对象", description="")
public class UserAuths implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "授权方id")
      @TableId(value = "auth_id", type = IdType.ID_WORKER_STR)
    private String authId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "第三方登录openid")
    private String authOpenid;

    @ApiModelProperty(value = "第三个方登录类型，如码云")
    private String authType;


}
