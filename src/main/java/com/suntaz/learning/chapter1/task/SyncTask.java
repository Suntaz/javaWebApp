package com.suntaz.learning.chapter1.task;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component

public class SyncTask {
    public Random random = new Random();

    public void doTaskOne() throws Exception{
        System.out.println("Start taskOne");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("finish taskOne, spend time ="+(end-start)+" ms");
    }

    public void doTaskTwo() throws Exception{
        System.out.println("Start taskTwo");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("finish taskTwo, spend time ="+(end-start)+" ms");
    }

    public void doTaskThree() throws Exception{
        System.out.println("Start taskThree");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("finish taskThree, spend time ="+(end-start)+" ms");
    }
}
