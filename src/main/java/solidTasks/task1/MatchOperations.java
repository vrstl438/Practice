package solidTasks.task1;

public class MatchOperations {
    public static int add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(1,1,1,1,1,1,1,1,1,1,1,1,1));
    }
}