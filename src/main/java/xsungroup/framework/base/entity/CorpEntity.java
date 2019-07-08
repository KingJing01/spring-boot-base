package xsungroup.framework.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 公司信息实体类 
 * @author: kingJing 
 * @Date: 2019/7/8 14:49
 */
@Data
@TableName("t_corp_test")
@ApiModel
public class CorpEntity extends BaseEntity {

    @TableField
    @ApiModelProperty(value = "公司名称")
    private String corpName;

    @TableField
    @ApiModelProperty(value = "公司地址")
    private String corpAddress;

    @TableField
    @ApiModelProperty(value = "法人")
    private String chargePerson;
}
