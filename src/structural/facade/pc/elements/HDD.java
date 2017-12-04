package structural.facade.pc.elements;

public class HDD {

    public void copyFromDVD(DVDRom disk) {
        if (disk.hasData()) {
            System.out.println("Копируем данные с DVD на HDD");
        } else {
            System.out.println("Вставьте диск в дисковод");
        }
    }
}
