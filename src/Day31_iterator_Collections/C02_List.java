package Day31_iterator_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Esat");
        stringList.add("Sevda");
        stringList.add("Seyma");
        stringList.add("Ilknur");

        System.out.println(stringList);

        stringList.add(2,"Nurhayat");
        System.out.println(stringList);
        //[Esat, Sevda, Nurhayat, Seyma, Ilknur]

        List<String> stringList1 = new LinkedList<>();
        stringList1.add("Yusuf");
        stringList1.add("Esat");
        stringList1.add("Ilknur");
        stringList1.add("Murat");

        System.out.println(stringList.retainAll(stringList1));

        System.out.println("Liste son hali : "+ stringList);
        //esat ilknur
        //ortak elemanlar kalir, digerlerini siler.
    }
}
