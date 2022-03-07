package com.zhaoyang.sunmall.product.controller;

import com.zhaoyang.sunmall.product.entity.CategoryEntity;
import com.zhaoyang.sunmall.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @RequestMapping("/list/tree")
    public List<CategoryEntity> list(){
        return categoryService.listWithTree();
    }
}