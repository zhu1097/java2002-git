package com.qf;

import com.qf.job.MyJob;
import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

import java.util.GregorianCalendar;

public class TestQuartz {
    public static void main(String[] args) throws Exception {
        //创建调度器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(2).repeatForever()).endAt(new GregorianCalendar(2021, 5, 27, 17, 30, 10)
                        .getTime()).build();
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("job1", "group1").build();
        scheduler.scheduleJob(jobDetail,trigger);
        scheduler.start();

    }
}
