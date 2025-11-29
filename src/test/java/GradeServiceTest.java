import Final_HomeTasks.Task_3.GradeService;
import Final_HomeTasks.Task_3.InvalidGradeException;
import Final_HomeTasks.Task_3.StudentGrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

public class GradeServiceTest {
    private GradeService gradeService;

    @BeforeEach
    void setUp(){
        gradeService = new GradeService();
    }

   @DisplayName("Проверка добавления оценки - addGrade") @Test
    void addGradeTestsAdd(){
       StudentGrade grade1 = new StudentGrade("Misha","Math", 3);
       StudentGrade grade2 = new StudentGrade("Misha","Math", 3.6);

       assertEquals(3, grade1.getGrade());
       assertEquals(3.6, grade2.getGrade());
   }

   @DisplayName("Проверка exeption - addGrade") @Test
    void addGradeTestForValueNull(){
       StudentGrade grade1 = new StudentGrade("Misha","Math", null);
       StudentGrade grade2 = new StudentGrade("Misha",null, 1);

       assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade1));
       assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade2));
   }

    @DisplayName("Проверка при отрицательных значениях - addGrade") @Test
    void addGradeTestForNegativeValue(){
        StudentGrade grade1 = new StudentGrade("Misha","Math", -2);
        StudentGrade grade2 = new StudentGrade("Misha","Math", -0.1);

        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade1));
        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade2));
    }


    //sortedGrade

    @DisplayName("sortedGrade Проверка среднего значения") @Test
    void sortedGradeAverage(){
        gradeService.addGrade(new StudentGrade("Ivan","Math", 4));
        gradeService.addGrade(new StudentGrade("Ivan","Math", 3));
        gradeService.addGrade(new StudentGrade("Ivan","Math", 5));
        gradeService.addGrade(new StudentGrade("Ivan","Physics", 5));

        assertEquals(4, gradeService.sortedGrade("Math"));
    }

    @DisplayName("sortedGrade Проверка на недобвленный предмет") @Test
    void sortedGradeEmptySubject(){
        gradeService.addGrade(new StudentGrade("Ivan","Math", 4));

        assertThrows(InvalidGradeException.class, () -> gradeService.sortedGrade("Physics"));
        assertThrows(InvalidGradeException.class, () -> gradeService.sortedGrade(""));
        assertThrows(InvalidGradeException.class, () -> gradeService.sortedGrade(null));
        assertThrows(InvalidGradeException.class, () -> gradeService.sortedGrade("-01"));
    }
}
