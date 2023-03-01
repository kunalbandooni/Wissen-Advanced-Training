package Features;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    void run(){
        List<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        
        System.out.println("PRINTING ALL:");
        l1.forEach(x -> System.out.println(x));

        System.out.println("PRINTING EVEN:");
        l1.forEach(x -> {if(x % 2 == 0) System.out.println(x);} );
    }
}