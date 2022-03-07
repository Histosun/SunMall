package com.zhaoyang.sunmall.product.service;

import com.zhaoyang.sunmall.product.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> listWithTree();

}
