public class PushNotifier implements Notifier {
    
    @Override public void sendNotification(String Push){
        System.out.println("Push Notification : " + Push);
    }
}
