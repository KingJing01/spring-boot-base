package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(hidden = true)
    private String createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(hidden = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @TableField(fill=FieldFill.INSERT_UPDATE)
    @ApiModelProperty(hidden = true)
    private String updateUser;

    @TableField
    @ApiModelProperty(hidden = true)
    private int isAble;

    @TableField(exist = false)
    private long pageSize = 1;

    @TableField(exist = false)
    private long pageNum = 10;

}
