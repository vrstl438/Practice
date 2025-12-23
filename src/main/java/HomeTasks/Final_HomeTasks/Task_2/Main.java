package HomeTasks.Final_HomeTasks.Task_2;
import static HomeTasks.Final_HomeTasks.Task_2.UserValidator.validatingUser;


public class Main {
    public static void main(String[] args) {
        UserValidator.validationEnabledManager(true);
        validatingUser(new UserModel ("Vanya", 91, "qwert@gmail.com"));

        System.out.println("Пользователь валиден!");
    }
}
