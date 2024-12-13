package org.training.capital.microservice.spring20241209.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Component
public class MyAsyncBean {

    @Async("myExecutors")
    public Future<String> myAsync(String str) {
        System.out.println("MyAsync : " + Thread.currentThread()
                                                .getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException eParam) {
        }
        return CompletableFuture.completedFuture("deneme async " + str);
    }

}
