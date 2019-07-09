package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* @Description: 基础Entity封装.
* @Author: kingJing
* @Date: 2019/7/5 13:53
**/
@Data
public abstract class BaseEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    @ApiModelProperty(hidden = true)
    private String id;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(hidden = true)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(hidden = true)
    private String createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(hidden = true)
    private Date updateTime;

    @TableField(fill=FieldFill.INSERT_UPDATE)
    @ApiModelProperty(hidden = true)
    private String updateUser;

    @TableField
    @ApiModelProperty(hidden = true)
    private int isAble;

}
