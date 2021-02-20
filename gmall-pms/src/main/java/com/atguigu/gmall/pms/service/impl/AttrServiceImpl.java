package com.atguigu.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.dao.AttrDao;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.service.AttrService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo queryAttrsByCid(QueryCondition condition, Long cid, Integer type) {
        Query<AttrEntity> entityQuery = new Query<AttrEntity>();
        IPage<AttrEntity> page = entityQuery.getPage(condition);
        QueryWrapper<AttrEntity> wrapper = new QueryWrapper<>();
        if (cid != null) {
            wrapper.eq("catelog_id",cid);
        }
            wrapper.eq("attr_type",type);
        IPage<AttrEntity> iPage = this.page(page, wrapper);

        return new PageVo(iPage);
    }

}