package com.xpc.service.impl;

import com.xpc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by xpc on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("121334");
        Assert.assertEquals("121334",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> upAll = productService.findUpAll();
        Assert.assertNotEquals(0,upAll.size());
    }

    @Test
    public void findAll() throws Exception {
       // Page
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> all = productService.findAll(pageRequest);
//        System.out.println(all.getTotalElements());
        Assert.assertNotEquals(0,all.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("6595566");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(23.5));
        productInfo.setProductStock(500);
        productInfo.setProductDescription("还不错哦");
        productInfo.setProductIcon("http://xxx1.png");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

}