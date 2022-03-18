package com.zhaoyang.sunmall.product.service;

import com.zhaoyang.sunmall.product.entity.CategoryEntity;
import com.zhaoyang.sunmall.product.request.CategoryName;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CategoryService {
    List<CategoryEntity> listWithTree();

    void deleteCategories(List<Long> ids);

    void softDelete(List<Long> ids);

    void save(CategoryEntity entity);

    void edit(CategoryName nameRequest);
}
