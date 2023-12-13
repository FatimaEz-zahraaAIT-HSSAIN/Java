import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        String message ="";

        for(int i=0; i< args.length; i++){
            message += args[i] + " ";
        }
        List<Notifier> Notifications = new ArrayList<>();
        Notifications.add(new EmailNotifier());
        Notifications.add(new PushNotifier());
        Notifications.add(new SMSNotifier());
        Notifications.add(new SlackNotifier());

        for(int i = 0; i < Notifications.size(); i++ ){
            Notifications.get(i).sendNotification(message);
        }


    }
}
