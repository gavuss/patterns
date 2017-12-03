package bevavioral.observer;

public class OnlineBoard implements IObserver {

    @Override
    public void handleEvent(int planeNumber, String time) {
        System.out.println("Табло прибытия");
        System.out.println("Борт #" + planeNumber + "; Время прибытия - " + time);
        System.out.println();
    }
}
