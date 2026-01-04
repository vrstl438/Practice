package patterns.task6;

public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();

        Window macWindow = windowsFactory.createWindow();

        macWindow.draw();
    }
}
