package com.xpc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xpc on 2017/11/30.
 */
@Entity
@DynamicUpdate//动态更新，自动更新时间问题
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    //
//    private Date createTime;
//
//    private Date updateTime;


}
