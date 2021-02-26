package com.atguigu.gmall.search.repository;

import com.atguigu.gmall.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by WXHang on HANG at 2021/2/26 16:06
 */
public interface GoodsRespository extends ElasticsearchRepository<Goods,Long> {

}
