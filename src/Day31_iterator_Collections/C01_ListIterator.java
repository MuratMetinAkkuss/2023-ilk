package Day31_iterator_Collections;

import java.util.*;

public class C01_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar);


        //index kullanmadan listenin tum elementlerine 2 ekleyiniz
        ListIterator lit = sayilar.listIterator();
        Integer sayi = 0 ;
        while (lit.hasNext()){
            sayi = (Integer) lit.next();
            lit.set(sayi+2);
        }
        System.out.println(sayilar);

        //iterator kullanarak list'in elementlerini sondan basaa dogru yazdirin
        //yukaridaki islemden dolayi iterator en sonda duruyor

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+ " ");
        }

        //iterator'u nerede birakirsak orada kalacaktir.
        //basta oldugundan emin olmak isterseniz
        //ya yeni bir iterator olusturursunuz veya loop body'si bos olan
        //while loop ile en basa kadar giderseniz.

        //ornegin iterator'i en sona goturelim

        while (lit.hasNext()){
            lit.next();
        }


        Queue<String> stringQueue = new LinkedList<>();
    }
}
