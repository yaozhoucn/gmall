package com.atguigu.gmall.sms.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WXHang on HANG at 2021/2/2 14:50
 *
 * 分页插件
 */

@Configuration
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        //设置请求的页面大于最大页后操作，true 调回到首页，false 继续请求默认false
        // paginationInterceptor. set0verflow(false);
        //设置最大单页限制数量，默认500条，-1不受限制
        // paginationInterceptor. setL imit (500);

        return paginationInterceptor;
    }

}

