package Day31_Maps;

import java.util.Map;

public class C05_KeyValueBirlikteKullanma {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapMethods.ogrenciMapMethodu();

        //,grenci numarasi verilen iki deger arasinda olan sinir dahil
        //tum ogrencilerin numara isim soyisim ve bolumlerini yazdirin.

        int basNo=101;
        int bitNo=104;

        MapMethods.numaraAraligindakiOgrencileriYazdir(ogrenciMap,basNo,bitNo);


    }
}
