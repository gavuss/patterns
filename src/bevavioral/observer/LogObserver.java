package bevavioral.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class LogObserver implements IObserver {

    @Override
    public void handleEvent(int planeNumber, String time) {
        File log;
        try {
            log = new File("D:\\project\\patterns\\temp", "log.txt");
            PrintWriter pw = new PrintWriter(log);
            pw.print("Борт #" + planeNumber + "; Время прибытия - 01:14:49.443");
            pw.println();
            pw.close();
            System.out.println("Информаци записан в " + log.getPath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
