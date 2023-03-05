package Features;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    void run(){
        Semaphore sem = new Semaphore(1);

        new displayNumbers1("Thread1", sem);
        new displayStrings("Thread2", sem);
    }
    public static void main(String[] args) {
        SemaphoreDemo o = new SemaphoreDemo();
        o.run();
    }
}

class displayNumbers1 implements Runnable{
    String threadName;
    Semaphore sem;

    displayNumbers1(String threadName, Semaphore sem){
        this.threadName = threadName;
        this.sem = sem;
        new Thread(this).start();
    }
    
    public void run(){
        try{
            sem.acquire();
            System.out.println("\n" + threadName + "got the permission...");
            for(int i=0;i<5;i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(400);
            }
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println(threadName + " is released...");
        sem.release();
    }
}

class displayStrings implements Runnable{
    String threadName;
    Semaphore sem;

    displayStrings(String threadName, Semaphore sem){
        this.threadName = threadName;
        this.sem = sem;
        new Thread(this).start();
    }
    
    public void run(){
        try{
            List<String> name = Arrays.asList("Kunal", "James", "Bond", "Rowan");

            sem.acquire();
            System.out.println("\n" + threadName + " got the permission...");
            for(String str : name){
                System.out.println(threadName + " : " + str);
                Thread.sleep(400);
            }
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println(threadName + " is released...");
        sem.release();
    }
}