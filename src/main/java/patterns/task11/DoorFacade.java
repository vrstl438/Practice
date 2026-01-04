package patterns.task11;

public class DoorFacade {

    public void action(String action) {
        switch (action) {
            case "open" -> new Open().start();
            case "close" -> new Close().start();
            case "block" -> new Block().start();
            default -> System.out.println("not found");
        }
    }
}
