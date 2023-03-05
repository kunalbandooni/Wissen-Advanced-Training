package Features;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo{
    void run() throws InterruptedException{
        // after each n parties (5 in this case), a thread ends, and another begins
        CyclicBarrier cb = new CyclicBarrier(5, new Finished());

        for(int i=1;i<=15;i++){
            new MyThread("Thread-"+i, cb);
            Thread.sleep(400);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        CyclicBarrierDemo o = new CyclicBarrierDemo();
        o.run();
    }
}

class MyThread implements Runnable{
    String threadName;
    CyclicBarrier cb;

    MyThread(String name, CyclicBarrier cb){
        this.threadName = name;
        this.cb = cb;
        new Thread(this).start();
    }

    public void run(){
        try{
            System.out.println(threadName);
            cb.await();
        }
        catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}

class Finished implements Runnable{
    public void run(){
        System.out.println("Finished...");
    }
}