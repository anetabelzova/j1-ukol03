package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {


        System.out.println("Program spuštěn.");

        Pocitac anetyPocitac = new Pocitac();


        Disk anetyDisk = new Disk();
        anetyDisk.setKapacita(494_195_726_150L);
        anetyDisk.setVyuziteMisto(172_195_726_150L);

        Pamet anetyPamet = new Pamet();
        anetyPamet.setKapacita(8_000_000_000L);

        Procesor anetyProcesor = new Procesor();
        anetyProcesor.setVyrobce("MacOs Ventura");
        anetyProcesor.setRychlost(1_600_000_000_000L);


        anetyPocitac.setCpu(anetyProcesor);
        anetyPocitac.setRam(anetyPamet);
        anetyPocitac.setPevnyDisk(anetyDisk);



        System.out.println(anetyPocitac);

        anetyPocitac.zapniSe();
        anetyPocitac.vypniSe();

        anetyPocitac.vytvorSouborOVelikosti(345);
        anetyPocitac.vymazSouboryOVelikosti(543);
    }

}
