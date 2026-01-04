package patterns.task12;

public class Main {
    public static void main(String[] args) {
        SmartHouseFacade facade = new SmartHouseFacade();

        facade.off("security");
        facade.on("lighting");
        facade.off("lighting");
    }
}
