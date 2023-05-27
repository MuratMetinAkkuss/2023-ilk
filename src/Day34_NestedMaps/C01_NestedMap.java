package Day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_NestedMap {


    public static void main(String[] args) {
        /*
        ogrencileri map'e eklerken key olarak numara
        value olarak tum bilgiyi girdigimizde
        ogrecniyi eklemek tek 1 satir surerken
        ogrencinin bilgisine ulasmak veya update etmek cok uzun suruyor

        Eger bilgilere erisim ve update'in daha hizli yapilabilmesini istersek
        Nested Map kullanabiliriz

        Ogrencileri ve bilgilerini Nested Map olarak girmek uzun olacaktir
        Ancak erisim ve update'in kisa olmasi icin bunu tercih edebiliriz.


         */
        Map<Integer , Map<String,String>> studentMap = new HashMap<>();
        Map<String,String> studentInfoMap = new HashMap<>();

        studentInfoMap.put("Isim","Ali");
        studentInfoMap.put("Soyisim","Can");
        studentInfoMap.put("sinif","12");
        studentInfoMap.put("sube","I");
        studentInfoMap.put("brans","TM");

        studentMap.put(101,studentInfoMap);

        Map<String,String> studentInfoMap2 = new HashMap<>();

        studentInfoMap2.put("Isim","Veli");
        studentInfoMap2.put("Soyisim","Cem");
        studentInfoMap2.put("sinif","10");
        studentInfoMap2.put("sube","K");
        studentInfoMap2.put("brans","TM");

        studentMap.put(102,studentInfoMap2);

        Map<String,String> studentInfoMap3 = new HashMap<>();

        studentInfoMap.put("Isim","Ali");
        studentInfoMap.put("Soyisim","Cem");
        studentInfoMap.put("sinif","11");
        studentInfoMap.put("sube","K");
        studentInfoMap.put("brans","TM");

        studentMap.put(103,studentInfoMap3);

        System.out.println(studentMap);

        //101 numarali ogrencinin bilgilerini yazdir

        System.out.println(studentMap.get(101));

        //102 numarali ogrencinin soyismini yazdirin

        System.out.println(studentMap.get(102).get("Soyisim"));

        //103 numarali ogrencinin bransini yazdir

        System.out.println(studentMap.get(103).get("Brans"));


    }
}
