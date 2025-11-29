package Final_HomeTasks.Task_2;

import Final_HomeTasks.Task_2.Exeptions.InvalidUserException;


public class UserValidator <T extends UserModel>{
    private static boolean validationEnabled;

    public static void validationEnabledManager(boolean state){
        validationEnabled = state;
    }

    public static boolean nameValidator(String name) {
        if (validationEnabled){
            return name != null && !name.isEmpty() && Character.isUpperCase(name.charAt(0));
        }else {
            return true;
        }
    }

    public static boolean ageValidator(int age) {
        if(validationEnabled){
            return age >= 18 && age <= 100;
        }else{
            return true;
        }
    }

    public static boolean emailValidator(String email) {
        if(validationEnabled){
            if (email == null) return false;
            return email.matches("[a-z0-9.]+@[a-z]+\\.[a-z]{2,}$");
        }else{
            return true;
        }
    }

    public static void validatingUser(UserModel user) {
        if (!nameValidator(user.getName())) {
            throw new InvalidUserException("Некорректное имя: " + user.getName());
        }

        if (!ageValidator(user.getAge())) {
            throw new InvalidUserException("Некорректный возраст: " + user.getAge());
        }

        if (!emailValidator(user.getEmail())) {
            throw new InvalidUserException("Некорректная почта: " + user.getEmail());
        }
    }
}