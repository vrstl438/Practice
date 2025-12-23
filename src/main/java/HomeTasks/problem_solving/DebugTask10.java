package HomeTasks.problem_solving;
import java.util.*;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(a -> a.startsWith("A"));
        System.out.println(names);
    }
}