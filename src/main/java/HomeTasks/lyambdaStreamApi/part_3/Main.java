package HomeTasks.lyambdaStreamApi.part_3;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //task-1
        List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        Integer newListNums = numsList.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(newListNums);

        //task-2
        List<Integer> numsMinList = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        Integer newListMinNums = numsMinList.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println(newListMinNums);

        //task-3
        List<Integer> sumNums = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 324);
        Integer newSumNums = sumNums.stream()
                .reduce((a, b) -> a + b)
                .get();
        System.out.println(newSumNums);

        //task-4
        List<String> listString = Arrays.asList("qwe", "qwert", "Bwqerty", "Bsjqdhlkfj");
        List<String> firstB = listString.stream()
                .filter(a -> a.startsWith("B"))
                .limit(1)
                .toList();
        System.out.println(firstB);

        //task-5
        List<Integer> selectNums = Arrays.asList(1, 3, 4, 5, 10, 15, 324);
        Boolean select = selectNums.stream()
                .anyMatch(a -> a % 2 == 0);
        System.out.println(select);
    }
}
