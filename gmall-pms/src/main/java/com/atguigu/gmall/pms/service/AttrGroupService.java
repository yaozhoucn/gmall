package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.gmall.pms.vo.GroupVO;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 属性分组
 *
 * @author wangxiaohang
 * @email wangxiao_h@126.com
 * @date 2021-02-01 23:24:47
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo querGroupBypage(QueryCondition queryCondition, Long catId);

    GroupVO queryGroupWithAttrsByGid(Long gid);
}

