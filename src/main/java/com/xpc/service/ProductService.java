package com.xpc.service;

import com.xpc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by xpc on 2017/11/30.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减去库存
}
