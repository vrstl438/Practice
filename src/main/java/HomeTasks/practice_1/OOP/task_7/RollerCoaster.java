package HomeTasks.practice_1.OOP.task_7;

public class RollerCoaster implements Attraction {

    @Override
    public void feelings(){
        System.out.println("Ощущения не для слабонервных");
    }

    @Override
    public void service(){
        System.out.println("проверка безопасности");
    }
}
