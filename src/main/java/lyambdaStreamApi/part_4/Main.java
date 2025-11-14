package lyambdaStreamApi.part_4;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //task-1
        List<String> list = Arrays.asList("qwe", "qwert", "Bwqerty", "Bsjqdhlkfj");
        Map <String, List<String>> newList = list.stream()
                .collect(Collectors.groupingBy(a -> String.valueOf(a.charAt(0))));
        System.out.println(newList);

        //task-2
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        Map<Boolean, List<Integer>> newNums = nums.stream()
                .collect(Collectors.groupingBy(a ->(a % 2 == 0)));
        System.out.println(newNums);

        //task-3
        List<Integer> listNums = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        Integer sum = listNums.stream()
                .reduce(Integer::sum)
                .get() / listNums.size();
        System.out.println(sum);
    }
}
