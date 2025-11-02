package practice_1.OOP.task_8;

import practice_1.OOP.task_3.Menu;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibits sclupture = new Sculpture();
        Exhibits manuscript = new Manuscript();

        museum.setExhibits(manuscript);
        museum.printInfo();
    }
}
