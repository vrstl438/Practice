package HomeTasks.exceptioanAndJenerics.generics;

public class PairTask3<T, T1>{

    public static void main(String[] args) {
        PairTask3 pair = new PairTask3();
        pair.setA("fdgebgr");
        pair.setB(2134235467);
        pair.printInfo();
    }
    private T a;
    private T1 b;

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T1 b) {
        this.b = b;
    }

    public void printInfo(){
        System.out.println(this.a + "  " + this.b);
    }
}
