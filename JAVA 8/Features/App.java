package Features;

import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

import javax.script.ScriptException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException, InterruptedException, ExecutionException{
        System.out.println("LAMBDA: ");
        Lambda obj1 = new Lambda();
        obj1.run();

        System.out.println("INTERFACE: ");
        InterfaceDemo obj2 = new InterfaceDemo();
        obj2.run();

        System.out.println("FOR EACH: ");
        ForEach obj3 = new ForEach();
        obj3.run();

        System.out.println("METHOD REFERENCES: ");
        MethodReference obj4 = new MethodReference();
        obj4.run();

        System.out.println("OPTIONAL CLASSES: ");
        OptionalClassDemo obj5 = new OptionalClassDemo(0);
        obj5.run();

        System.out.println("LOCAL DATE AND TIME: ");
        DateAndTimeDemo obj6 = new DateAndTimeDemo();
        obj6.run();

        System.out.println("NASHORN: ");
        NashornDemo obj7 = new NashornDemo();
        obj7.run();

        System.out.println("STREAMS: ");
        StreamsDemo obj8 = new StreamsDemo();
        obj8.run();

        System.out.println("THREAD SYNCHRONIZATION: ");
        ThreadSynchronisationDemo obj9 = new ThreadSynchronisationDemo();
        obj9.run();

        System.out.println("SEMAPHORE : ");
        SemaphoreDemo obj10 = new SemaphoreDemo();
        obj10.run();

        System.out.println("CYCLIC BARRIER : ");
        CyclicBarrierDemo obj11 = new CyclicBarrierDemo();
        obj11.run();

        System.out.println("COUNTDOWN LATCH : ");
        CountDownLatchDemo obj12 = new CountDownLatchDemo();
        obj12.run();

        System.out.println("EXECUTOR SERVICE : ");
        ExecutorServiceDemo obj13 = new ExecutorServiceDemo();
        obj13.run();

        System.out.println("RE-ENTRANT LOCK : ");
        ReentrantLockDemo obj14 = new ReentrantLockDemo();
        obj14.run();
    }
}