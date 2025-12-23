package Complex_Tasks.Task_6;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;
@Getter
@AllArgsConstructor
public class UserVisit {
    private final String IP;
    private final LocalDateTime time;
    private final String page;

    public boolean comparisonByIP(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserVisit that = (UserVisit) o;
        return Objects.equals(IP, that.IP);
    }
}
