package Final_HomeTasks.Task_3;

import lombok.Getter;

import javax.xml.namespace.QName;

@Getter
public class StudentGrade <T extends Number> {
    //Поля для имени студента, предмета и оценки.
    //Оценка должна быть типа T, который расширяет класс Number.
    //Конструктор для инициализации всех полей.
    //Геттеры для доступа к полям.

    private String name;
    private String subject;
    private T grade;

    public StudentGrade(String name, String subject, T grade){
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }
}
