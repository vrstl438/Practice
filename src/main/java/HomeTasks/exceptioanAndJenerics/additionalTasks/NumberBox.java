package HomeTasks.exceptioanAndJenerics.additionalTasks;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number>{
    private List<T> list = new ArrayList<>();

    public void setList(List<T> list) {
        this.list = list;
    }

    public void sumArray(){
        Double sum = 0.0;
        for (T a : list){
            sum = a.doubleValue();
        }
    }
}
