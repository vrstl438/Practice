package exceptioanAndJenerics.additionalTasks;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class lastTask {
    public static void main(String[] args) {
        Map<String, String> f = new HashMap<>();
        f.put("F", "f");
        keyValue(f);
    }

    public static<T, B> void keyValue(Map <T, B> map) {
        for (Map.Entry<T, B> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
