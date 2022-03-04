package com.zhaoyang.sunmall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("sunmall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/list")
    List allCoupons();
}
