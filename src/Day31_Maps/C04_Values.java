package Day31_Maps;

import java.util.Map;

public class C04_Values {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethods.ogrenciMapMethodu();
        System.out.println(ogrenciMap);




        //Tum ogrencilerin sadece Value'larini yazdirin
        System.out.println(ogrenciMap.values());

        //istenen siniftaki tum ogrencilerin isim ve soyisimlerini yazdir.

        MapMethods.istenenSiniftakiOgrencileriYazdir(ogrenciMap,11);
    }
}
