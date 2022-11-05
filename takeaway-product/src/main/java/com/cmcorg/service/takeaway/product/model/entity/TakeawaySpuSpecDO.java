package com.cmcorg.service.takeaway.product.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.cmcorg.engine.web.auth.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TableName(value = "takeaway_spu_spec")
@Data
@Schema(description = "子表：商品 SPU规格表，主表：商品 SPU")
public class TakeawaySpuSpecDO extends BaseEntity {

    @Schema(description = "SPU 主键 id（外键）")
    private Long spuId;

    @Schema(description = "规格 json对象集合字符串，例如：[{}]")
    private String specJsonListStr;

}