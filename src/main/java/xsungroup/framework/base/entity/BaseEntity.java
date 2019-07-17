package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 基础Entity封装.
 * @Author: kingJing
 * @Date: 2019/7/5 13:53
 **/
public abstract class BaseEntity implements Serializable {
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

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(hidden = true)
    private String updateUser;

    @TableField
    @ApiModelProperty(hidden = true)
    private int isAble;

    /**
     * 分页查询封装参数
     */
    @TableField(exist = false)
    private long pageSize = 1;

    @TableField(exist = false)
    private long pageNum = 10;

    @TableField(exist = false)
    private String columns;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getIsAble() {
        return isAble;
    }

    public void setIsAble(int isAble) {
        this.isAble = isAble;
    }

    @JsonIgnore
    public long getPageSize() {
        return pageSize;
    }

    @JsonProperty
    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    @JsonIgnore
    public long getPageNum() {
        return pageNum;
    }

    @JsonProperty
    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    @JsonIgnore
    public String getColumns() {
        return columns;
    }

    @JsonProperty
    public void setColumns(String columns) {
        this.columns = columns;
    }


}
