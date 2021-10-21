package com.suntaz.learning.chapter1;


import com.suntaz.learning.chapter1.task.AsyncTask;
import com.suntaz.learning.chapter1.task.SyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest1 {
    @Autowired
    private SyncTask syncTask;

    @Autowired
    private AsyncTask asyncTask;

//    @Test
//    public  void test() throws Exception{
//        syncTask.doTaskOne();
//        syncTask.doTaskTwo();
//        syncTask.doTaskThree();
//    }

    @Test
    public  void testAsync() throws Exception{
        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();
    }
}
