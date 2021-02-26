package com.atguigu.gmall.search.feign;

import com.atguigu.gmall.wms.api.GmallWmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by WXHang on HANG at 2021/2/26 15:36
 */
@FeignClient("wms-service")
public interface GmallWmsClient extends GmallWmsApi{
}
