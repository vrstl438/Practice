package Final_HomeTasks.Task_1;

import lombok.Getter;

import java.util.Objects;

@Getter
public class EssenceModel {
    private String name;
    private Integer age;
    private Boolean activity;

    public EssenceModel(String name, Integer age, Boolean activity){
        this.name = name;
        this.age = age;
        this.activity = activity;
    }

    @Override
    public String toString(){
        return "|Essence -- " + "name = " + name + ", " + "age = " + age + ", " + "activity = " + (activity ? "Активный" : "Неактивный");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EssenceModel that = (EssenceModel) o;
        return Objects.equals(age, that.age) &&
                Objects.equals(name, that.name) &&
                Objects.equals(activity, that.activity);
    }

    @Override
    public int hashCode(){
        return Objects.hash(age, name, activity);
    }
}
