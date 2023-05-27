package Day33_Maps;

import Day31_Maps.MapMethods;

import java.util.Map;

public class C01_Tekrar {

    public static void main(String[] args) {

       Map<Integer,String> ogrenciMap = MapMethods.ogrenciMapMethodu();
        System.out.println(ogrenciMap);
        //tum ogrenci listesini yazdirin

        MapMethods.tumOgrenciListeYazdir(ogrenciMap);

        MapMethods.numaraAraligindakiOgrencileriYazdir(ogrenciMap,100,110);




    }
}

