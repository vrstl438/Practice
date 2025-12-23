package HomeTasks.Final_HomeTasks.Task_3;

import lombok.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class GradeService <T extends Number>{
    private List<StudentGrade<T>> gradeContainer = new ArrayList<>();

    //Список List<StudentGrade<T>> для хранения оценок.
    //Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.
    //Метод для расчёта среднего значения оценок по конкретному предмету.
    //Обработка исключений через InvalidGradeException, если оценка некорректна.
    @Synchronized
    public void addGrade(StudentGrade<T> grade){
        if (grade.getGrade() == null || grade.getSubject() == null){
            throw new InvalidGradeException("Неправильные данные: null");
        } else if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка не может быть отрицательной: " + grade.getGrade());
        }
        gradeContainer.add(grade);
    }

    @Synchronized
    public double sortedGrade(String subject){
        return gradeContainer.stream()
                .filter(t -> t.getSubject().equals(subject))
                .mapToDouble(t -> t.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new InvalidGradeException("Некорректные значения " + subject));
    }
}