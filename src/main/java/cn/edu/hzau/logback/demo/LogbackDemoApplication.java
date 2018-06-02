package cn.edu.hzau.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(LogbackDemoApplication.class);

    public static void main(String[] args) {
        logger.info("Enter application.");

        Foo foo = new Foo();
        foo.traceMethod();
        foo.debugMethod();
        foo.infoMethod();
        foo.warnMethod();
        foo.errorMethod();

        Bar bar = new Bar();
        bar.traceMethod();
        bar.debugMethod();
        bar.infoMethod();
        bar.warnMethod();
        bar.errorMethod();

        logger.info("Exit application.");
    }
}
