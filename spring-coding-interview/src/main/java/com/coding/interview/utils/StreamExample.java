package com.coding.interview.utils;

import java.io.IOException;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {

        /*Stream<String> streamOfStrings = Stream.of("Sunday", "Monday", "Wednesday", "Friday");
        streamOfStrings.forEach(System.out::println);

        Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        streamOfIntegers.forEach(System.out::println);

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> streamOgIntegerArray = Stream.of(array);
        streamOgIntegerArray.forEach(System.out::println);

        List<String> list1 = Arrays.asList("https://", "javatechonline", "dot", "com"); //creating a list//OR
        Stream<String> streamOfString = list1.stream();
        streamOfString.forEach(System.out::println);

        Stream<String> streamOfParralStream = list1.parallelStream();
        streamOfParralStream.forEach(System.out::println);

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfString1 = Arrays.stream(arr);
        streamOfString1.forEach(System.out::println);

        Stream.Builder<String> builder = Stream.builder();
        builder.add("a").add("b").add("c").add("d");
        Stream<String> s = builder.build();
        s.forEach(System.out::println);
        //OR We can reduce above code to a one-liner as below:
        Stream<String> s1 = Stream.<String>builder().add("a").add("b").add("c").build();

        Stream<String> emptyStream = Stream.empty();
*/
      /*  Random random = new Random();
        Stream<String> stream = Stream.generate(
                () -> String.valueOf(random.nextInt(100))
        ).limit(5);
        stream.forEach(System.out::println);

        Stream<Integer> streamOfIntegers = Stream.iterate(1, n -> n + 2);
        streamOfIntegers.forEach(System.out::println);

        Stream<String> streamOfStrings = Files
                .lines(Paths.get("C:\\Users\\USER\\OneDrive\\Desktop\\files\\file.txt")).filter(x -> x.startsWith("a"));// Generating Stream from a File
        streamOfStrings.forEach(System.out::println);

        Stream<String> streamWithCharset = Files
                .lines(Paths.get("C:\\Users\\USER\\OneDrive\\Desktop\\files\\file.txt"), StandardCharsets.UTF_8);
        streamWithCharset.forEach(System.out::println);
*/
/*        static IntStream range(int startInclusive, int endExclusive);
        static IntStream range(int startInclusive, int endExclusive)
        static IntStream rangeClosed(int startInclusive, int endInclusive)
        static LongStream range(long startInclusive, long endExclusive)
        static LongStream rangeClosed(long startInclusive, long endInclusive)
        int i = IntStream.range(1, 5).sum();
        System.out.println(i);

        int j = IntStream.rangeClosed(1, 10).sum();
        System.out.println(j);

        long k = LongStream.range(1, 5).sum();
        System.out.println(k);

        long l = LongStream.rangeClosed(1, 10).sum();
        System.out.println(l);*/

       /* List<String> strings = Stream.of("this", "is", "a", "list", "of", "strings").toList();
        strings.forEach(System.out::println);

        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5, 6).boxed().toList();
        ints.forEach(System.out::println);

        List<Integer> ints1 = IntStream.of(1, 2, 3, 4, 5, 6).mapToObj(Integer::valueOf).toList();
        ints1.forEach(System.out::println);

        int[] intArray = IntStream.of(1,2,3,4,5).toArray();*/

        /*Stream<String> filterVal = Stream.of("lion", "cat", "monkey", "cow", "horse");
        filterVal.filter(x -> x.startsWith("c")).forEach(System.out::println);

        Stream<String> distinctVal = Stream.of("cat", "cat", "monkey", "cow", "cat");
        distinctVal.distinct().forEach(System.out::println);

        String s = "Hello World";
        Stream<Character> stream = s.codePoints()
                .mapToObj(character -> (char) character);
        stream.distinct().forEach(System.out::print);

        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(9).limit(6).forEach(System.out::print);

        Stream<String> streamOfStrings = Stream.of("Sunday", "Monday", "Wednesday", "Friday");
        streamOfStrings.sorted().forEach(System.out::println);
        System.out.println("Reversed order");
        streamOfStrings.sorted(Comparator.reverseOrder()).forEach(System.out::println);
*/
        // Stream<String> s = Stream.of("Cow", "Tiger", "Elephant");
        //System.out.println(s.count());

/*
        Stream<String> str = Stream.of("Java", "Python", "Scala");
        Optional<String> min = str.min((s1, s2) -> s1.length() — s2.length());
        min.ifPresent(System.out::println);

        Optional<Integer> firstEvenNumber = Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 3)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(firstEvenNumber);


        Optional<Integer> firstNumberDivisibleBy5 = Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 10, 3)
                .filter(n -> n > 5).filter(n -> n % 2 == 0).findFirst();
        System.out.println(firstNumberDivisibleBy5);


        List<String> listOfSkills = Arrays.asList("Core Java", "Spring Boot", "Hibernate", "Angular");
        Predicate<String> pred = x -> x.startsWith("S");
        System.out.println(listOfSkills.stream().anyMatch(pred));         // true
        System.out.println(listOfSkills.stream().allMatch(pred));         // false
        System.out.println(listOfSkills.stream().noneMatch(pred));        // false

        Stream<String> streamOfSkills = Stream.of("Java", "Python", "Angular");
        streamOfSkills.forEach(System.out::println);
 */
       // Stream<String> streamOfSkills = Stream.of("Java", "Scala", "Python", "Spring");
//        streamOfSkills
//                .filter(x -> x.startsWith("S"))
//                .collect(Collectors.toList())     //Collecting the result of a stream into a List
//                .forEach(System.out::println);
//
//        streamOfSkills
//                .filter(x -> x.length() > 3)
//                .collect(Collectors.toCollection(ArrayList::new))    //Collecting the result of a stream into a List of our choice
//                .forEach(System.out::println);

       // List<String> letters = Arrays.asList("j", "a", "v", "a", "t", "e", "c", "h", "o", "n", "l", "i", "n", "e");
//        String result = letters .stream()
//                .reduce(" ", (partialString, element) -> partialString + element);
//        System.out.println(result);

        // String result1 = letters.stream().reduce(" ", String::concat);
        // System.out.println(result1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfSquareOfEvenNumber = list.stream()
                .filter(x -> x % 2 == 0).mapToInt(n -> n * n).sum();
        System.out.println(sumOfSquareOfEvenNumber);


    }
}

