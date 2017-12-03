package bevavioral.observer;

public class EmailObserver implements IObserver{

    @Override
    public void handleEvent(int planeNumber, String time) {
        System.out.println("Отправить email с информацией о времени пребытии самолета # - " + planeNumber);
        System.out.println("Отправленно на ololo@lol.lo: \"Борт номер - " + planeNumber + "; Время прибытия - \" + time");
        System.out.println("Отправленно на trlolo@trlolo.tlo: \"Борт номер - " + planeNumber + "; Время прибытия - \" + time");
        System.out.println();
    }
}
