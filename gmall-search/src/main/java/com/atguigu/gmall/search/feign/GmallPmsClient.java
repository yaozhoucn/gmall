package com.atguigu.gmall.search.feign;

import com.atguigu.gmall.pms.api.GmallPmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by WXHang on HANG at 2021/2/26 15:36
 */
@FeignClient("pms-service")
public interface GmallPmsClient extends GmallPmsApi {
}
