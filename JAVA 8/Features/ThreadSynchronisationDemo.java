package Features;

public class ThreadSynchronisationDemo {
    void run(){
        new ThreadDemo("Thread 1");
        new ThreadDemo("Thread 2");
        new ThreadDemo("Thread 3");
    }
}

class Shared{
    static int count = 0;
}

class ThreadDemo implements Runnable{
    String threadName;

    ThreadDemo(String name){
        this.threadName = name;
        new Thread(this).start();
    }

    public void run(){
        // This is class level locking, 
        //  even with mutiple objects, it will be synchronised
        synchronized(ThreadSynchronisationDemo.class){
            System.out.println("\nThread : " + threadName + " got the permission...");
            for(int i=0;i<5;i++){
                ++Shared.count;
                System.out.println(threadName + " COUNT : " + Shared.count);
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " is realeased");
        }
    }
}