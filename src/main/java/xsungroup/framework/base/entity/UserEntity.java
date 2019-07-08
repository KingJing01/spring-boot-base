package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 用户信息实体类
 * @author: kingJing 
 * @Date: 2019/7/8 15:02
 */
@Data
@TableName("t_user_test")
@ApiModel
public class UserEntity extends BaseEntity {

    @TableField
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @TableField
    @ApiModelProperty(value = "用户年龄")
    private int age;

    @TableField
    @ApiModelProperty(value = "用户性别")
    private String sex;
}
