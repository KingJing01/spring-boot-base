package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@TableName("t_corp_test")
@ApiModel
public class CorpEntity extends BaseEntity {

    @TableField
    private String corpName;

    @TableField
    private String corpAddress;

    @TableField
    private String chargePerson;
}
