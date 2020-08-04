package com.qf.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class MyJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(new Date().toLocaleString());
    }
}
