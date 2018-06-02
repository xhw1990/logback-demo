package cn.edu.hzau.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
    private static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void traceMethod() {
        logger.trace("Foo#traceMethod is called.");
    }

    public void debugMethod() {
        logger.debug("Foo#debugMethod is called.");
    }

    public void infoMethod() {
        logger.info("Foo#infoMethod is called.");
    }

    public void warnMethod() {
        logger.warn("Foo#warnMethod is called.");
    }

    public void errorMethod() {
        logger.error("Foo#errorMethod is called.");
    }
}
