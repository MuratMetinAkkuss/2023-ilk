package Day25_inheritance;

public class BToyata extends Araba{

    BToyata(int yil ){
        this();
        System.out.println("Toyata int cons");
    }
    BToyata(){
        System.out.println("Toyata cons");
    }
    String uretimYeri = "Belli degil";
    String makra ="Toyata";

}
