package com.zhaoyang.sunmall.product.repository;

import com.zhaoyang.sunmall.product.entity.SpuInfoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpuInfoDescRepository extends CrudRepository<SpuInfoEntity, Long> {
}
