package Day24_inheritance;

import Day17_constructors.C07_hastane;

public class Coralla extends BToyata {

    String uretimYeri="Turkiye";
    String lastik = "coralla araclar pirelli 205-60-16 lastik kullanir";
    String model = "Coralla";
    boolean autoParak=false;
    boolean cruiseControl = true;
    public void hiz(){
        System.out.println("Coralla araclar max 240 km hiz yapar");
    }
    public void guvenlik(){
        System.out.println("Coralla araclar 12 tane havayastigi kullanir");

    }


    public static void main(String[] args) {

        Coralla coralla1 = new Coralla();
        System.out.println(coralla1.uretimYeri);
        System.out.println(coralla1.lastik);
        System.out.println(coralla1.model);
        System.out.println(coralla1.autoParak);
        System.out.println(coralla1.cruiseControl);
        System.out.println(coralla1.marka);
        System.out.println(coralla1.tekerSayisi);
        coralla1.hiz();
        coralla1.guvenlik();
        coralla1.aku();

    }

}
