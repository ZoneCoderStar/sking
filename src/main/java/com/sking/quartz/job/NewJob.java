package com.sking.quartz.job;

import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class NewJob implements BaseJob {
    private static Logger log = LoggerFactory.getLogger(NewJob.class);

    @Override
    public void execute(JobExecutionContext context) {
        log.info("NewJob 执行时间："+new Date());
    }
}
