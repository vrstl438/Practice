package exceptioanAndJenerics.generics;

public class task2 {


    public static void main(String[] args) {
        Integer [] a = {1, 2, 5, 6, 7, 8} ;
        String [] b = {"q", "qw", "qwe", "qwer"};
        printArray(b);
    }


    public static <T> void printArray(T [] array){
        for (T chars : array){
            System.out.println(chars);
        }
    }



}
