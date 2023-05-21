package Day30_exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar);

        for (int i = 0; i < sayilar.size() ; i++) {
            sayilar.set(i, sayilar.get(i) + 2);
        }
        System.out.println(sayilar);


        /*
            Java da farkli ozelliklere sahip birden fazla element barindirabilen
            cok sayida yapi vardir.

            biz bugune kadar:
            Array
            list
            bunlari gorduk
            yarin:Collections (LinkedList, queue, deque, set)
            sonra: maps

            bu yapilarin hepsi index kullanmaz


         */

        //index kullanmadan listteki elementleri iki artirip yazar misin?
        //foreach kullanilir.

        for (Integer eachSayi: sayilar
        ) {
            System.out.print(eachSayi+2 + " ");
        }

        System.out.println(" ");
        System.out.println(sayilar);
        //listte degisim olmadi
        //for each kullanarak listin elemanlarini 2 arttirip kalici hala
        //getirip listin yeni degerlerini kaydedelim
        //yukari da soylenen islemin olmasi imkansiz cunku;
        //atama yapilsa bile loop dongusune ait scope'da kaliyor


        // burada iterator bize bazi ozellikler sagliyor
        Iterator itr = sayilar.iterator();

        /*
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

         */
        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(sayilar);




    }
}
