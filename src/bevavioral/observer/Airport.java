package bevavioral.observer;

import java.time.LocalTime;

public class Airport {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        dispatcher.addObserver(new OnlineBoard());
        dispatcher.addObserver(new EmailObserver());
        dispatcher.addObserver(new LogObserver());

        dispatcher.setPlaneInfo(1526, LocalTime.now().plusHours(2).toString());
    }
}
