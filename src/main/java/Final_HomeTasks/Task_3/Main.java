package Final_HomeTasks.Task_3;

public class Main {
    public static void main(String[] args) {
        GradeService gradeService = new GradeService();
        gradeService.addGrade(new StudentGrade("Ilya", "Math", 3));
        gradeService.addGrade(new StudentGrade("Ilya", "Math", 4));
        gradeService.addGrade(new StudentGrade("Ilya", "Math", 5));

        gradeService.addGrade(new StudentGrade("Ilya", "Physics", 4));
        gradeService.addGrade(new StudentGrade("Ilya", "Physics", 2));
        gradeService.addGrade(new StudentGrade("Ilya", "Physics", 5));

        System.out.println(gradeService.sortedGrade("Math"));
        System.out.println(gradeService.sortedGrade("Physics"));
        System.out.println(gradeService.sortedGrade("12"));


    }
}
