package com.xpc.service.impl;

import com.xpc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xpc on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;


    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = categoryService.findAll();
        Assert.assertNotEquals(0,all.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2, 3));
        Assert.assertNotEquals(0,byCategoryTypeIn.size());

    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("孕妇专享",11);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}