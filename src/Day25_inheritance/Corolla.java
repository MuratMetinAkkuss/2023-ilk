package Day25_inheritance;

import Day24_inheritance.Coralla;

public class Corolla extends BToyata{
    Corolla(){
        System.out.println("Coralla cons");
    }
    Corolla(int sayi){

        System.out.println("Coralla Int parametreli cons");
    }
    Corolla(String yakit){
        super(5);
        //parent class'da olmayan bir constructor call yapilirsa
        //JAVA CTE verir.
        System.out.println("coralla String cons");
    }
    String uretimYeri = "Turkiye";
    String model = "Corolla";

    public static void main(String[] args) {
        //Corolla corolla = new Corolla(5);
        Corolla corolla = new Corolla("Elektrikli");
    }
}
