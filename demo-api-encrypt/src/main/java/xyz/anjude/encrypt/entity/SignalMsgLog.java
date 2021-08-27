package xyz.anjude.encrypt.entity;

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
@ApiModel(value="SignalMsgLog对象", description="")
public class SignalMsgLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消息唯一标识")
      @TableId(value = "msg_id", type = IdType.ID_WORKER_STR)
    private String msgId;

    @ApiModelProperty(value = "消息体, json格式化")
    private String msg;

    @ApiModelProperty(value = "交换机")
    private String exchange;

    @ApiModelProperty(value = "路由键")
    private String routingKey;

    @ApiModelProperty(value = "状态: 0投递中 1投递成功 2投递失败 3已消费")
    private Integer status;

    @ApiModelProperty(value = "重试次数")
    private Integer tryCount;

    @ApiModelProperty(value = "下一次重试时间")
    private Date nextTryTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
