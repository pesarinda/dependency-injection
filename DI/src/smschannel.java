public class smschannel implements NotificationChannel{
    @Override
    public void sendNotification() {
        System.out.println("sms notification sent");
    }
}
