package patterns.task2;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger logger;

    private List<String> completedConnect = new ArrayList<>();
    private List<String> errorExceptions = new ArrayList<>();
    private List<String> warnings = new ArrayList<>();

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public List<String> getCompletedConnect() {
        return this.completedConnect;
    }

    public List<String> getErrorExceptions() {
        return errorExceptions;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void addLogsCompletedConnect(String message) {
        completedConnect.add(message);
    }

    public void addLogsErrorExceptions(String message) {
        errorExceptions.add(message);
    }

    public void addLogsWarrnings(String message) {
        warnings.add(message);
    }
}
