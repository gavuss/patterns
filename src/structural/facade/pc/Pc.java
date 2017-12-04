package structural.facade.pc;

import structural.facade.pc.elements.DVDRom;
import structural.facade.pc.elements.HDD;
import structural.facade.pc.elements.Power;

public class Pc {
    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    public void copyDataFromDVD() {
        power.on();
        dvdRom.loadDisk();
        hdd.copyFromDVD(dvdRom);
    }
}
