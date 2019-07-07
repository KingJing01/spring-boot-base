package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
    private String id;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT)
    private String createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableField(fill=FieldFill.INSERT_UPDATE)
    private String updateUser;

    @TableField
    private int isAble;

}
