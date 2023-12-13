public class SlackNotifier implements Notifier{
    
    @Override public void sendNotification(String Slack){
        System.out.println("Slack Notification : " + Slack);
    }
}
