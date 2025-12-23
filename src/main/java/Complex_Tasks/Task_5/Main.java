package Complex_Tasks.Task_5;

public class Main {
    public static void main(String[] args) {
        ChatSystem chatSystem = new ChatSystem();
        User Max = new User("Max");

        chatSystem.newMessage(Max, new Message("Hello, Max!"));
        System.out.println(chatSystem.historyMessageForUser(Max));
    }
}
