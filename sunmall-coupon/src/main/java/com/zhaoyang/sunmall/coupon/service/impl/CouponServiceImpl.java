package com.zhaoyang.sunmall.coupon.service.impl;

import com.zhaoyang.sunmall.coupon.entity.CouponEntity;
import com.zhaoyang.sunmall.coupon.repository.CouponRepository;
import com.zhaoyang.sunmall.coupon.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {
    private final CouponRepository couponRepository;

    public List<CouponEntity> allCoupons(){
        return couponRepository.findAll();
    }
}
