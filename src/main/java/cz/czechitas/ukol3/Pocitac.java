package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Počítač = " + " cpu = " + cpu + "/" + " ram = " + ram + "/" + " pevnýDisk = " + pevnyDisk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }


    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Vypínám počítač");
            jeZapnuty = false;
        } else {
            System.err.println("Počítač už je vypnutý");
        }
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač už je zapnutý");

        } else {
            if (this.ram == null || this.cpu == null || this.pevnyDisk == null) {
                System.err.println("Počítač nejde zapnout, protože musí obsahovat všechny části");

            } else {
                jeZapnuty = true;
                System.out.println("Zapínám počítač");
            }
        }

    }


    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (pevnyDisk.getVyuziteMisto() + velikost < pevnyDisk.getKapacita()) {
                System.out.println("Ukládám soubor");
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
            } else {
                System.err.println("Využité místo je větší než kapacita");
            }
            System.out.println("Počítač je zapnutý");
        }

    }
    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty){
            if (pevnyDisk.getVyuziteMisto() - velikost > 0){
                System.out.println("Ukládám soubor");
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
            }else {
                System.err.println("Využité místo je menší než nula");
            }
            System.out.println("Počítač je zapnutý");
        }

    }



}
