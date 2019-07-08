package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@TableName("t_user_test")
@ApiModel
public class UserEntity extends BaseEntity {

    @TableField
    private String userName;

    @TableField
    private int age;

    @TableField
    private String sex;
}
