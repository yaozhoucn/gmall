package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/2/20 10:23
 */
@Data
public class GroupVO extends AttrGroupEntity {
    private List<AttrEntity> attrEntities;

    private List<AttrAttrgroupRelationEntity> relations;
}
