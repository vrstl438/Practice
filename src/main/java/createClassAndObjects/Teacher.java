package createClassAndObjects;

public class Teacher {
    String name;
    String subject;

    public Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    //геттеры
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    //сеттеры
    public void setName(String newName){
        this.name = newName;
    }
    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

    public void printInfo(){
        System.out.println("Имя учителя: " + this.name + "   Предмет учителя: " + this.subject);
    }
}
