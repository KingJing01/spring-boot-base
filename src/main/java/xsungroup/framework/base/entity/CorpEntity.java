package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_corp_test")
public class CorpEntity extends BaseEntity {

    @TableField
    private String corpName;

    @TableField
    private String corpAddress;

    @TableField
    private String chargePerson;
}
