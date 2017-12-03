package bevavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher implements IObservable {

    int planeNumber;
    String time;

    List<IObserver> observers = new ArrayList<>();

    public void setPlaneInfo(int planeNumber, String time) {
        this.planeNumber = planeNumber;
        this.time = time;
        notifyObserver();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.handleEvent(planeNumber, time );
        }
    }
}
