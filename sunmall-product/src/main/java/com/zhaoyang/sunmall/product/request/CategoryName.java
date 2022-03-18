package com.zhaoyang.sunmall.product.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CategoryName {
    final Long catId;
    final String name;
}
