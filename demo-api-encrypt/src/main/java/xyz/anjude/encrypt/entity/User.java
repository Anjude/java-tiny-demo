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
@TableName("index_user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id，主键")
      @TableId(value = "user_id", type = IdType.ID_WORKER_STR)
    private String userId;

    @ApiModelProperty(value = "用户名")
    private String userNickName;

    @ApiModelProperty(value = "用户登录名称")
    private String userAccount;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;

    @ApiModelProperty(value = "用户邮箱，可用于注册和登录")
    private String userEmail;

    @ApiModelProperty(value = "用户手机号，暂不用于注册")
    private String userPhone;

    @ApiModelProperty(value = "性别 0（男）,1（女）,2（保密）")
    private Boolean userSex;

    @ApiModelProperty(value = "用户头像")
    private String userAvatar;

    @ApiModelProperty(value = "用户登录版本号")
    private Integer userVersion;


}
