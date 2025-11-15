package ThreadHomeWork;
//task-3
public class Flag {
    private static volatile int counter = 0;
    private static volatile boolean flag = true;

    public static void counerPlus(){
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public static void setFlag(){
        flag = false;
    }

    public static boolean getFlag(){
        return flag;
    }
}
