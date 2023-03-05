package Features;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    void run() throws InterruptedException{
        ReentrantLock lock = new ReentrantLock();
        
        new MyThread("A", lock);
        Thread.sleep(2000);

        new MyThread("B", lock);
        Thread.sleep(2000);
        
        new MyThread("C", lock);
        Thread.sleep(2000);

        new MyThread("D", lock);
        Thread.sleep(2000);

        new MyThread("E", lock);
        Thread.sleep(2000);
    }
    public static void main(String[] args) throws InterruptedException {
        ReentrantLockDemo o = new ReentrantLockDemo();
        o.run();
    }
}

class Shared{
    static int count = 0;
}

class MyThread implements Runnable{
    String threadName;
    ReentrantLock lock = new ReentrantLock();

    public MyThread(String threadName, ReentrantLock lock){
        this.threadName = threadName;
        this.lock = lock;
        new Thread(this).start();
    }

    public void run(){
        System.out.println("\nStarting " + threadName);
        System.out.println(threadName + " is waiting to acquire lock on shared resource.");
        lock.lock();

        System.out.println(threadName + " has acquired lock on shared resource...");
        Shared.count++;

        System.out.println(threadName + " : " + Shared.count);
        System.out.println(threadName + " is releasing lock for shared resource...");

        lock.unlock();
        System.out.println(threadName + " finished...");
    }
}