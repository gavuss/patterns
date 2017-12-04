package bevavioral.observer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airport {

    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.addObserver(new OnlineBoard());
        dispatcher.addObserver(new EmailObserver());
        dispatcher.addObserver(new LogObserver());

        dispatcher.setPlaneInfo(1526, getTimeArrival());
    }

    public static String getTimeArrival() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String timeArrival = LocalTime.now().plusHours(2).format(timeFormatter);
        return timeArrival;
    }
}
