package com.xpc.repository;

import com.xpc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xpc on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory one = repository.findOne(1);
        System.out.println(one.toString());
    }

    @Test
    @Transactional//事物回滚，测试数据不会写表
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(10);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }

}