package com.zhaoyang.sunmall.product.controller;

import com.zhaoyang.sunmall.product.entity.CategoryEntity;
import com.zhaoyang.sunmall.product.request.CategoryName;
import com.zhaoyang.sunmall.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/list/tree")
    public List<CategoryEntity> list(){
        return categoryService.listWithTree();
    }

    @DeleteMapping
    public void deleteCategories(@RequestBody List<Long> ids){
        categoryService.deleteCategories(ids);
    }

    @PostMapping("/delete")
    public void softDeleteCategories(@RequestBody List<Long> ids){
        categoryService.softDelete(ids);
    }

    @PostMapping("/save")
    public void save(@RequestBody CategoryEntity entity){
        categoryService.save(entity);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody CategoryName nameRequest){
        categoryService.edit(nameRequest);
    }
}
