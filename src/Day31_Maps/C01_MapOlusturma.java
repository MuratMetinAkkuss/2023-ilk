package Day31_Maps;

import java.lang.reflect.Array;
import java.util.*;

public class C01_MapOlusturma {
    public static void main(String[] args) {

        //variavle olusturma
        int sayi = 5 ;
        String str = "Java Candir";

        //coklu element barindiran collections olusturma

        List<String> list = new ArrayList<>();
        Set<Integer> sayiSeti = new HashSet<>();

        //map her zaman key-value ikilsii barindirir
        //bu ozelligi sebebiylemap olustururken
        //key ve value'nun data turleri belirtilmedir.

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");


        //103 numaralari ogrencinin subesini yazdiriniz
        //Map'te tum bilgiler String olarak birlestirilen value icerisindedir
        //String'deki bir bilgiye direkt ulasamayiz
        //manipulation yapip istedigimiz bilgiye ulasmaliyiz.

        //istenen ogrencinin value'sunu bularak kaydedelim.
        String str1  = ogrenciMap.get(103);
        System.out.println(str1);

        //istenen ogrencinin value'sunu array'e ekleyerek alt degerleri cikaralim
        String[] array1 = str1.split("-");
        System.out.println(Arrays.toString(array1));

        //istenen sube bilgisini index uzerinden yazdiralim.
        System.out.println(array1[3]);

    }
}
