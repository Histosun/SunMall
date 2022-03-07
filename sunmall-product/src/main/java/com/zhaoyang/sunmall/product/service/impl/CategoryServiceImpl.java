package com.zhaoyang.sunmall.product.service.impl;

import com.zhaoyang.sunmall.product.entity.CategoryEntity;
import com.zhaoyang.sunmall.product.repository.CategoryRepository;
import com.zhaoyang.sunmall.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> all = categoryRepository.findAll();
        Set<Long> pId = all.stream().map(CategoryEntity::getParentCid).collect(Collectors.toSet());
        Map<Long, List<CategoryEntity>> pCategory = new HashMap<>();
        pId.forEach(it ->
                pCategory.put(it,
                        all.stream().filter(categoryEntity -> Objects.equals(categoryEntity.getParentCid(), it))
                                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                                .collect(Collectors.toList())
                )
        );
        all.forEach(it -> it.setSubCategory(pCategory.get(it.getCatId())));;
        return pCategory.get(0L);
    }

}
