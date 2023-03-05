package Features;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    void run() throws InterruptedException{
        CountDownLatch cd1 = new CountDownLatch(5);
        
        MyThread1 t1 = new MyThread1("t1", cd1);
        Thread.sleep(600);

        MyThread1 t2 = new MyThread1("t2", cd1);
        Thread.sleep(600);
        
        MyThread1 t3 = new MyThread1("t3", cd1);
        Thread.sleep(600);
        
        MyThread1 t4 = new MyThread1("t4", cd1);
        Thread.sleep(600);
        
        MyThread1 t5 = new MyThread1("t5", cd1);
        Thread.sleep(600);

        cd1.await();
        System.out.println("All the threads are up and running...");
    }
}
class MyThread1 implements Runnable{
    String threadName;
    CountDownLatch cd1;

    MyThread1(String threadName, CountDownLatch cd1){
        this.threadName = threadName;
        this.cd1 = cd1;
        new Thread(this).start();
    }

    public void run(){
        try{
            System.out.println(threadName + " started...");
            Thread.sleep(1000);
            cd1.countDown();
        }
        catch(InterruptedException e){
            System.out.print(e);
        }
    }
}