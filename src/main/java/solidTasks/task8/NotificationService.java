package solidTasks.task8;

public class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.send(message);
    }

    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationService notificationService = new NotificationService(emailSender);

        notificationService.sendNotification("Сообщение!");
    }
}
