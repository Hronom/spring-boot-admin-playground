package com.github.hronom.springboottestapp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SpamService {
    private final Log logger = LogFactory.getLog(getClass());

    @Scheduled(fixedDelay = 20_000)
    public void spam() {
        logger.error("Spam");
        logger.info("Spam");
        logger.warn("Spam");
        logger.debug("Spam");
        logger.trace("Spam");
    }
}
