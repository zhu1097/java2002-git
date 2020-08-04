package com.qf.test;

import org.quartz.JobKey;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.utils.Key;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuartz {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        StdScheduler scheduler = (StdScheduler)applicationContext.getBean("scheduler");
//        scheduler.pauseJob(JobKey.jobKey("job1","group1"));
//        Thread.sleep(3000);
//        scheduler.resumeJob(JobKey.jobKey("job1","group1"));
        GroupMatcher<JobKey> group1 = GroupMatcher.groupEquals("group1");
        scheduler.pauseJobs(group1);
        Thread.sleep(3000);
        scheduler.resumeJobs(group1);

    }
}
