package com.zhaoyang.sunmall.member.controller;


import com.zhaoyang.sunmall.member.feign.CouponFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

    private final CouponFeignService couponFeignService;

    @GetMapping("/coupons")
    public List getCoupons(){
        return couponFeignService.allCoupons();
    }
}
