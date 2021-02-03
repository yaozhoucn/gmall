package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * Created by WXHang on HANG at 2021/2/3 10:24
 */

@Configuration
public class GmallCorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){
    //初始化cors配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //配置允许的域
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        //配置是否允许携带cookie信息
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");

        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource1 = new UrlBasedCorsConfigurationSource();
        //添加映射路径，拦截一切请求；
        urlBasedCorsConfigurationSource1.registerCorsConfiguration("/**",corsConfiguration);
        //cros过滤器对象
        return new CorsWebFilter(urlBasedCorsConfigurationSource1);
    }
}
