package AdvanceJavaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        
        // Map -- Intermediate Operation
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(numbers); // [2, 3, 4, 5]
        System.out.println(square); // [4, 9, 16, 25]

        // Filter -- Intermediate Operation
        List<String> names = Arrays.asList("Berhampur", "Bhubaneswar", "Bangalore", "Mumbai");
        List<String> startsWithB = names.stream().filter(s -> s.startsWith("B")).collect(Collectors.toList());
        System.out.println(names); // [Berhampur, Bhubaneswar, Bangalore, Mumbai]
        System.out.println(startsWithB); // [Berhampur, Bhubaneswar, Bangalore]

        // Sorted -- Intermediate Operation
        List<String> sortedCities = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedCities); // [Bangalore, Berhampur, Bhubaneswar, Mumbai]

        // Collect -- Terminal Operation
        List<Integer> nums = Arrays.asList(2,3,4,5,2);
        Set<Integer> squareSet = nums.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet); // [16, 4, 9, 25]

        // forEach -- Terminal Operation
        nums.stream().map(x -> x * x).forEach(y -> System.out.print(y + "   ")); // 4   9   16   25   4

        // reduce -- Terminal Operation
        System.out.println();
        int even = nums.stream().filter(x -> x%2==0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even); // 8
    }
}