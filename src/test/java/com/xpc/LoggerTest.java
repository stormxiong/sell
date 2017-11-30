package com.xpc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xpc on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    public static final Logger logger  = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
//        .debug("debug.....");
//        logger.info("info....");
//        logger.error("error....");
//        errorlog.debug("debug.....");
        //LO
//        log.debug("ddddd");
        log.info("info....");
        log.debug("debug....");
        log.error("error....");
    }
} 
