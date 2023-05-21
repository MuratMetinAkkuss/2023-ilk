package Day31_Maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Keys {
    public static void main(String[] args) {
        //her class'da map ile islem yapabilmek icin
        //bir map olusturmak ve ogrencileri eklemek zorundayiz
        //MapMethods class'inda bir map olusturup
        //ogrencileri bize donduren bir method olusturalim.

        Map<Integer, String> ogrenciMaps = MapMethods.ogrenciMapMethodu();


        MapMethods.tumOgrenciListeYazdir(ogrenciMaps);

    }
}
