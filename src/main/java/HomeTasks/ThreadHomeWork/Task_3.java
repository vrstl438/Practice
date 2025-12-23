package HomeTasks.ThreadHomeWork;

public class Task_3 {
    public static void main(String[] args) {
        Thread mainThread = new Thread(() ->{
            try {
                Thread.sleep(2000);
                Flag.setFlag();
                System.out.println("2 секунды прошли!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread = new Thread(() -> {
            while(Flag.getFlag()){
                Flag.counerPlus();
            }
            System.out.println(Flag.getCounter());
        });

        thread.start();
        mainThread.start();



    }
}
