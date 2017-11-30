package com.xpc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by xpc on 2017/11/30.
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;//库存

    private String productDescription;//描述

    private String productIcon;//小图

    private Integer productStatus;

    private Integer categoryType;

} 
