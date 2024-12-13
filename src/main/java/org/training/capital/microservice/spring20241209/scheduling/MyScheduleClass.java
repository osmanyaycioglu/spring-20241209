package org.training.capital.microservice.spring20241209.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduleClass {

    private int count;

    @Scheduled(initialDelay = 1000L, fixedDelay = 5000L)
    public void abc() {
        System.out.println("schedule run : " + count++);
        try {
            Thread.sleep(100);
        } catch (InterruptedException eParam) {
        }
    }

    @Scheduled(cron = "*/5 * * * * *")
    public void method(){
        System.out.println("Cron job started.");
    }

}
