package com.zhaoyang.sunmall.product.repository;

import com.zhaoyang.sunmall.product.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Modifying
    @Transactional
    @Query("update CategoryEntity c set c.showStatus=0 where c.catId in :ids")
    void softDelete(@Param("ids") Iterable<Long> ids);
}
