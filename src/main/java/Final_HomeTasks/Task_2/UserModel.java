package Final_HomeTasks.Task_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {
    private String name;
    private int age;
    private String email;

    public UserModel(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
