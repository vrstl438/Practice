package patterns.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.addLogsCompletedConnect("31.12.2025");

        System.out.println(logger.getCompletedConnect());
    }
}
