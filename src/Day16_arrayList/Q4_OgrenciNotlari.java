package Day16_arrayList;

import java.util.List;

public class Q4_OgrenciNotlari {

    /*
        ogretmenden alinan ogrenci notlarinin ortalamasini ve
        kac ogrencinin ortalamanin ustunde not aldigini
        bize ulastiran bir method yazdirin
     */

    public static void main(String[] args) {

        List<Integer> notlarListesi = Q3_integerMethod.getAccessInt();

        ortalamalar(notlarListesi);
    }

    public static void ortalamalar(List<Integer> notlar){

        int toplam = 0 ;

        for (int i = 0; i < notlar.size() ; i++) {
            toplam += notlar.get(i);
        }
        int ortalama = toplam / notlar.size() ;
        int sayac = 0 ;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i) > ortalama ){
                sayac++;
            }
        }
        System.out.println("Sinif notlarinin ortalamasi : " + ortalama);
        System.out.println(sayac + " tane ogrenci ortalama ustu not aldi");
    }

}
