package Day33_Maps;

import Day31_Maps.MapMethods;

import java.util.HashMap;
import java.util.Map;

public class C02_EntryKey {
    /*
        suana kadar bize bir map verildgiinde key'lere ogrenciMap.values()
        ile ulasabiliyorduk

        eger hem key hem de value ile islem yapmamiz gerekirse
        mecburen key'lerin bulundugu set
        ve value'larin bulundugu collection objelerini beraber yonetmemiz gerekiyordu

        java key ve value'lari birlikte barindirmasi icin
        entry isimli bir class olusturmusutur
        e
        entr ile key ve value'yu birlikte kullanabilir
        entry izerinde yapilan update'leri otomatik olarak mao'e
        isleyebiliriz


     */

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethods.ogrenciMapMethodu();
        //ogrenci listesini numara isim soyisim sinif seklinde yazdirin

        MapMethods.ogrenciListesiniSekillendir(ogrenciMap);
    }
}
