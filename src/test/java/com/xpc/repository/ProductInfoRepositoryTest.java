package com.xpc.repository;

import com.xpc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by xpc on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("121334");
        productInfo.setProductName("红烧肉");
        productInfo.setProductPrice(new BigDecimal(25.5));
        productInfo.setProductStock(50);
        productInfo.setProductDescription("红烧肉味道不错");
        productInfo.setProductIcon("http://xxx.png");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }


    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0,byProductStatus.size());
    }

}