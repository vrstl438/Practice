package ThreadHomeWork;
//task-4
public class Counter {
    private static int counter = 0;

    public synchronized static void increment(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
