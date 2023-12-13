public class EmailNotifier implements Notifier{

    @Override public void sendNotification(String Email){
        System.out.println("E-mail Notification : " + Email);
    }

    

}
