package createClassAndObjects;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2020);
        bmw.setYear(2025);
        bmw.print();
        System.out.println("---------------");

        Rectangle rec1 = new Rectangle(10, 10);
        rec1.setWight(5);
        rec1.calculateArea();
        System.out.println("---------------");

        Book book1 = new Book("Таинственный остров","Жюль Верн");
        book1.setAuthor("Гоголь");
        book1.printInfo();
        System.out.println("---------------");

        BankAccount user1 = new BankAccount("Andrey", 1000);
        user1.deposit(1000);
        user1.withdraw(500);
        user1.printBalance();
        System.out.println("---------------");

        Point point1 = new Point(10,10);
        point1.setX(20);
        point1.print();
        System.out.println("---------------");

        StudentGroup group1 = new StudentGroup("228Г", 22);
        group1.setStudentCount(323);
        group1.printInfo();
        System.out.println("---------------");

        Circle circle1 = new Circle(10);
        circle1.setRadius(5);
        circle1.calculateArea();
        circle1.calculateCircumference();
        System.out.println("---------------");

        Teacher teach1 = new Teacher("Иван Олегович", "История");
        teach1.setSubject("Физкультура");
        teach1.printInfo();
        System.out.println("---------------");

        Product product1  = new Product("Apple", 10);
        product1.setPrice(101);
        product1.applyDiscount(20);
        product1.printInfo();
        System.out.println("---------------");

        Laptop lap1 = new Laptop("MacBook", 1000);
        lap1.setPrice(1200);
        lap1.printInfo();

    }
}
