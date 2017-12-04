package bevavioral.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class LogObserver implements IObserver {

    File log;

    @Override
    public void handleEvent(int planeNumber, String time) {

        try {

            log = new File("D:\\project\\patterns\\temp", "log.txt");
            if (!log.exists()) {
                log.getParentFile().mkdirs();
            }
            log.createNewFile();
            
            PrintWriter pw = new PrintWriter(log);
            pw.print("Борт #" + planeNumber + "; Время прибытия - " + time);
            pw.println();
            pw.close();
            System.out.println("Информация записана в " + log.getPath());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
