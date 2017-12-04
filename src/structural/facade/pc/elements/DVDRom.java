package structural.facade.pc.elements;

public class DVDRom {

    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void loadDisk() {
        System.out.println("Загрузить dvd-disk в дисковод");
        data=true;
    }

    public void ejectDisk() {
        System.out.println("Извлечь dvd-disk из дисковода");
        data=false;
    }
}
