package ThreadHomeWork;

public class Task_2 {
    public static void main(String[] args) {
        Thread threadA = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println("A");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadB = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println("B");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
