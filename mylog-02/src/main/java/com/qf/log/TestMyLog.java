package com.qf.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TestMyLog {
    // 需要输出日志的类，可以创建一个log属性
    Logger logger =LoggerFactory.getLogger(TestMyLog.class);
    @Test
    public void test1(){
        System.out.println(logger.getClass());
        logger.trace("hello trace");
        logger.debug("hello debug");
        logger.info("hello info");
        logger.warn("hello warn");
        logger.error("hello error");
    }
}
