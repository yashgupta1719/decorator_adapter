package adapter;

public class AppNotificationSender implements NotificationSender{

    private final DependencyNotificationSender dependencyNotificationSender;

    AppNotificationSender(DependencyNotificationSender dependencyNotificationSender){
        this.dependencyNotificationSender = dependencyNotificationSender;
    }

    @Override
    public void sendNotification(){
        dependencyNotificationSender.send();
    }

}
