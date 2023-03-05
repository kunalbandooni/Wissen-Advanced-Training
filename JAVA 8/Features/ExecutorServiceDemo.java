package Features;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    void run() throws InterruptedException, ExecutionException{
        ExecutorService es = Executors.newFixedThreadPool(3);

        Future f1 = es.submit(new SumES(10));
        Future f2 = es.submit(new SquareES(10));
        Future f3 = es.submit(new CubeES(10));

        System.out.println("Sum \t: " + f1.get());
        System.out.println("Square \t: " + f2.get());
        System.out.println("Cube \t: " + f3.get());
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorServiceDemo o = new ExecutorServiceDemo();
        o.run();
    }

}

class SumES implements Callable<Integer>{
    int value;
    
    SumES(int value){
        this.value = value;
    }

    public Integer call(){
        int res = 0;
        for(int i = 0; i <= value; i++)
            res += i;
        return res;
    }
}

class SquareES implements Callable<Integer>{
    int value;
    
    SquareES(int value){
        this.value = value;
    }

    public Integer call(){
        return value * value;
    }
}

class CubeES implements Callable<Integer>{
    int value;
    
    CubeES(int value){
        this.value = value;
    }

    public Integer call(){
        return value * value * value;
    }
}