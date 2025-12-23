package HomeTasks.lyambdaStreamApi.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //task-1
        List<String> listString = Arrays.asList("qwe", "qwert", "wqerty");
        List<String> newListString = listString.stream()
                .filter(a -> a.length() > 5)
                .toList();
        System.out.println(newListString);

        //task-2
        List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        List<Integer> newListNums = numsList.stream()
                .filter(a -> a % 5 == 0)
                .toList();
        System.out.println(newListNums);

        //task-3
        List<String> list = Arrays.asList("qwe", "qwert", "wqerty");
        List<Integer> newList = list.stream()
                .map(a -> a.length())
                .toList();
        System.out.println(newList);

        //task-4
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        List<Integer> newNums = nums.stream()
                .map(a -> a * a)
                .toList();
        System.out.println(newNums);

        //task-5
        List<Integer> numsDoubleList = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324, 1, 2, 3, 4, 5, 10, 15, 324);
        List<Integer> newNumsDoobleList = numsDoubleList.stream()
                .distinct()
                .toList();
        System.out.println(newNumsDoobleList);
    }
}
