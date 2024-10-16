interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка Email: " + message);
    }
}

class Notification {
    private MessageService messageService;


    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }


    public void send(String message) {
        messageService.sendMessage(message);
    }
}







public class Main4 {
    public static void main(String[] args) {

        MessageService emailService = new EmailService();
        Notification notification = new Notification(emailService);

        // Отправляем сообщение
        notification.send("Это сообщение через Email.");
    }
}
