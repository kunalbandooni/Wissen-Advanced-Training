package Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;

public class StreamsDemo {
    public void run(){
        anyMatch();
        noneMatch();
        //mapToLong();
        findAny();
        // ask allMatch too
    }

    void anyMatch(){
        List<Integer> list = Arrays.asList(3, 4, 6);
        boolean ans = list.stream().anyMatch( n -> (n*(n+1)) / 4 == 5);
        System.out.println("\nanyMatch() : ");
        System.out.println(ans);
    }

    void noneMatch(){
        List<Integer> list = Arrays.asList(4, 0, -1);
        boolean ans = list.stream().noneMatch(num -> num < 0);
        System.out.println("\nnoneMatch() : ");
        System.out.println(ans);
    }

    void mapToLong(){
        List<Integer> list = Arrays.asList(9, 27, 10);
        System.out.println("\nmapToLong() : ");
        list.stream().mapToLong(n -> Math.sqrt(n))
                        .forEach(System.out::println);
    }

    void findAny(){
        IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16);
        stream = stream.filter(i -> i % 4 == 0);

        System.out.println("\nfindAny() : ");
        OptionalInt answer = stream.findAny();
        if (answer.isPresent()) 
            System.out.println(answer.getAsInt());
    }

    void forEachOrdered(){
        List<Integer> list = Arrays.asList(10, 19, 1, 2);
        System.out.println("\nforEachOrdered() : ");
        list.stream().forEachOrdered(System.out::println);
    }

    void forEach(){
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("\nforEach() : ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    void allMatch(){
        List<Integer> list = Arrays.asList(3, 4, 6, 12);
        System.out.println("\nallMatch() : ");
        boolean ans = list.stream().allMatch(n -> n%3 == 0);
        System.out.println(ans);
    }

    void filter(){
        List<Integer> list = Arrays.asList(3, 4, 6, 12);
        System.out.println("\nfilter() : ");
        list.stream().filter(n -> n%3 == 0).forEach(System.out::println);
    }

    void findFirst(){
        List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);
        Optional<Integer> answer = list.stream().findFirst();

        System.out.println("\nfindFirst() : ");

        if (answer.isPresent())
            System.out.println(answer.get());
        else
            System.out.println("No Value");
    }

    void flatMapToInt(){
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println("\nfloatMapToInt() : ");
        list.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).
                        forEach(System.out::println);
    }

    void map(){
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        Stream<Integer> ans = list.stream().map(n -> n * 2);
        System.out.println("\nmap() : ");
        ans.forEach(n -> System.out.println(n));
    }

    void peek(){
        
    }

    public static void main(String[] args) {
        StreamsDemo o = new StreamsDemo();
        o.run();
    }
}