package HomeTasks.ThreadHomeWork;

public class Task_4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });


        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Counter.getCounter());
    }

}
