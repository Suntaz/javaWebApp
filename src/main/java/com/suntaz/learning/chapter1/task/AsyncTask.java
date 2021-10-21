package com.suntaz.learning.chapter1.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@EnableAsync
public class AsyncTask {
    public static Random random = new Random();

    @Async
    public void doTaskOne() throws Exception{
        System.out.println("aStart taskOne");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("finish taskOne, spend time ="+(end-start)+" ms");
    }

    @Async
    public void doTaskTwo() throws Exception{
        System.out.println("aStart taskTwo");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("finish taskTwo, spend time ="+(end-start)+" ms");
    }

    @Async
    public void doTaskThree() throws Exception{
        System.out.println("aStart taskThree");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("finish taskThree, spend time ="+(end-start)+" ms");
    }
}
