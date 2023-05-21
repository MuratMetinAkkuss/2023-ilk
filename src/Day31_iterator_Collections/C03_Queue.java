package Day31_iterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> yemekList = new LinkedList<>();
        yemekList.add("Murat");
        yemekList.add("Muhammed");

        //Murat ve Muhammed'in arasina bir eleman ekle diyelim'
        //Queue ozelliginden dolayi araya eleman eklemenez

        yemekList.remove();
        System.out.println(yemekList);
        //remove method'u ile sadece listenin basindan ozellik olarak
        //kaldirma islemini yapmaktadir.

        yemekList.add("Sevda");
        yemekList.add("Veysel");
        yemekList.add("Aysegul");

        System.out.println(yemekList);

        System.out.println(yemekList.poll());
        System.out.println(yemekList.poll());
        System.out.println(yemekList);



    }
}
