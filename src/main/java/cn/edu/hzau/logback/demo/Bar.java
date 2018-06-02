package cn.edu.hzau.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {
    private static final Logger logger = LoggerFactory.getLogger(Bar.class);

    public void traceMethod() {
        logger.trace("Bar#traceMethod is called.");
    }

    public void debugMethod() {
        logger.debug("Bar#debugMethod is called.");
    }

    public void infoMethod() {
        logger.info("Bar#infoMethod is called.");
    }

    public void warnMethod() {
        logger.warn("Bar#warnMethod is called.");
    }

    public void errorMethod() {
        logger.error("Bar#errorMethod is called.");
    }
}
