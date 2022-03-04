package com.zhaoyang.sunmall.coupon.controller;

import com.zhaoyang.sunmall.coupon.entity.CouponEntity;
import com.zhaoyang.sunmall.coupon.service.CouponService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("coupon")
@AllArgsConstructor
public class CouponController {
    private CouponService couponService;

    @GetMapping("/list")
    public List<CouponEntity> allCoupons(){
        return couponService.allCoupons();
    }
}
