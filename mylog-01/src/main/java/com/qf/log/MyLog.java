package com.qf.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class MyLog {

    public static void main(String[] args) throws Exception{

        Log log = LogFactory.getLog(MyLog.class);

        log.trace("堆栈信息");
        log.debug("调试信息");
        log.info("普通信息");
        log.warn("警告信息");
        log.error("普通错误信息");
        log.fatal("严重错误信息");

    }
    }

