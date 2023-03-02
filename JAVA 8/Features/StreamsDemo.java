package Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class StreamsDemo {
    public void run(){
        anyMatch();
        noneMatch();
        
        // not working
        mapToLong();
        
        findAny();
        forEachOrdered();
        forEach();
        
        // ask allMatch too - not working as thought
        allMatch();
        
        filter();
        findFirst();
        flatMapToInt();
        mapToInt();
        map();
        peek();
        counting();
        iterator();

        // not working... -> 0 de rha...
        generate();
        
        skip();
        summaryStatistics();
        builder();
        empty();
        toArray();
        sum();
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

    void mapToInt(){
        List<String> list = Arrays.asList("3", "6", "8", "14", "15");
  
        System.out.println("\nmapToInt() : ");
        list.stream().mapToInt(num -> Integer.parseInt(num))
                     .filter(num -> num % 3 == 0)
                     .forEach(System.out::println);
    }

    void map(){
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        Stream<Integer> ans = list.stream().map(n -> n * 2);
        System.out.println("\nmap() : ");
        ans.forEach(n -> System.out.println(n));
    }

    void peek(){
        System.out.println("\npeek() : ");
        Stream.of("one", "two", "three", "four")
            .filter(e -> e.length() > 3)
            .peek(e -> System.out.println("Filtered value: " + e))
            .map(String::toUpperCase)
            .peek(e -> System.out.println("Mapped value: " + e))
            .collect(Collectors.toList());
    }

    void counting(){
        Stream<String> s = Stream.of("Akash", "Harsh", "Shubham", "Nishant", "Pratik");
        long count_string =  s.collect(Collectors.counting());
        System.out.println("\ncounting() : ");
        System.out.println(count_string);
    }

    void iterator(){ 
        IntStream stream = IntStream.of(2, 4, 6, 8);
        PrimitiveIterator.OfInt answer = stream.iterator();

        System.out.println("\niterator() : ");
        while (answer.hasNext()) {
            System.out.println(answer.nextInt());
        }
    }

    void generate(){   
        IntStream stream = IntStream.generate(() -> { return (int)(Math.random() * 10000); });
  
        System.out.println("\ngenerate() : ");
        stream.limit(7).forEach(System.out::println);
    }

    void skip(){
        IntStream stream = IntStream.range(5, 12);
        
        System.out.println("\nskip() : ");
        stream.skip(4).forEach(System.out::println);
    }

    void summaryStatistics(){
        IntStream stream = IntStream.of(4, 5, 6, 7);
        IntSummaryStatistics summary_data = stream.summaryStatistics();
        System.out.println("\nsummaryStatistics() : ");
        System.out.println(summary_data);
    }

    void builder(){
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Hi")
                                    .add("Hello")
                                    .add("Bii")
                                    .add("Bii")
                                    .build();
        
        System.out.println("\nbuilder() : ");
        stream.forEach(System.out::println);
    }

    void empty(){
        Stream<String> stream = Stream.empty();
  
        System.out.println("\nempty() : ");
        stream.forEach(System.out::println);
    }

    void toArray(){
        Stream<String> stream = Stream.of("Nice", "this", "is", "very-very");
        Object[] arr = stream.toArray();

        System.out.println("\ntoArray() : ");
        System.out.println(Arrays.toString(arr));
    }

    void sum(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("\nsum() : ");
        System.out.println(list.stream().filter(i -> i > 5).
                            mapToInt(i -> i).sum());
    }

    public static void main(String[] args) {
        StreamsDemo o = new StreamsDemo();
        o.run();
    }
}