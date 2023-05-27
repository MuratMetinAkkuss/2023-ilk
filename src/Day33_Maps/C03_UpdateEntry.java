package Day33_Maps;

import Day31_Maps.MapMethods;

import java.util.Map;

public class C03_UpdateEntry {
    //ogrenci map'inde yil sonu sinif arttiralim
    //12'ler icin sinif bilgisi olarak mezun yazalim
    //mezun yazan varsa islem yapmayalim

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapMethods.ogrenciMapMethodu();

        System.out.println(MapMethods.yilSonuSinifArttir(ogrenciMap));


    }
}
