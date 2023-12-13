public class SMSNotifier implements Notifier{
    
    @Override public void sendNotification(String SMS){
        System.out.println("SMS Notification : " + SMS);
    }
}
