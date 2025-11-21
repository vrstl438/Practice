package problem_solving;

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);

    }
    public static void updateAge(Person person) {
        person = new Person(person.getName(), person.getAge() + 1);
        System.out.println("Updated age: " + person.getAge());
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}