package org.ziyuzile.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        while (true){
            String s = "" + i;

            logger.trace(s);
            logger.debug(s);
            logger.info(s);
            logger.warn(s);
            logger.error(s);
            Thread.sleep(2000);

            i ++;
        }
    }
}
