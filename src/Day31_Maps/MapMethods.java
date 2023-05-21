package Day31_Maps;

import java.util.*;

public class MapMethods {


    public static void ogrenciIsimVeSoyisimYazdirma(Map<Integer, String> ogrenciMap, int ogrenciNo) {

        String value = ogrenciMap.get(ogrenciNo);

        String[] valueIndex = value.split("-");

        System.out.println(valueIndex[0].substring(0,1).toUpperCase() +
                valueIndex[0].substring(1)+ " "+
                valueIndex[1].substring(0,1).toUpperCase() +
                valueIndex[1].substring(1));

    }

    public static Map<Integer, String> ogrenciMapMethodu(){
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static void tumOgrenciListeYazdir(Map<Integer, String> ogrenciMaps){
        //tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdirin
        //tum ogrencilere ulasabilmek icin,tum ogrencilerin key'lerine ihtiyac var

        Set<Integer> ogrenciKeySet = ogrenciMaps.keySet();

        //tum key'leri tek tek ele alip
        //o key'e ait isim ve soy ismi, yukaridaki method'u kullanarak yazdiralim

        for (Integer eachKey: ogrenciKeySet
             ) {
            ogrenciIsimVeSoyisimYazdirma(ogrenciMaps,eachKey);
        }
    }


    public static void istenenSiniftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sinif) {

        //istenen siniftaki tum ogrencilerin isim ve soyisimlerini yazdirin
        //siniflari kontrol edip istenen siniftaki ogrencileri yazdirmak icin
        //her bir value yu gozden gecirmeliyiz

        Collection<String> ogrenciCollection = ogrenciMap.values();

        for (String eachCollection: ogrenciCollection
             ) {

            String[] arreyOgrenci = eachCollection.split("-");

            if (arreyOgrenci[2].equals(sinif+"")){

            }

        }

    }

    public static void numaraAraligindakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {

        //burada ilk once numalari getirmemiz gerekiyor

        Set<Integer> ogrenciKey = ogrenciMap.keySet();

        for (Integer eachKey: ogrenciKey
             ) {
            if (basNo<=eachKey && eachKey<=bitNo){
                System.out.println(ogrenciMap.get(eachKey));
            }
        }

    }
}
