public class alertSystem {
    private final NotificationChannel notificationChannel;
    public alertSystem(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }
    public void raiseAlert(){
        notificationChannel.sendNotification();
        System.out.println("Alert has been delivered.");
        System.out.println();
    }
}
