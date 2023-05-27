package Day34_NestedMaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_UsageOfDiffirentDataTypes {

    public static String name ;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {


        /*
            Java'da farkli data turlerinden degerler eklemek istedigimiz
            herhangi bir non-primitive yapidan data turunu Object olarak verebiliriz

            bunun dezavamtaji ise
            elementler Object olarak kaydedildigi icin
            herhangi bir element icin kendi data turune ait
            metgid'lari direkt kullanamayiz

            Eger bir elementin data turunu net olarak biliyorsak ve
            o data turune ait bir method'u kullanmak istersek
            Data Casting yapabiliriz.
         */

        List<String> studentList = new ArrayList<>();
        studentList.add("Sevda");
        //studentList.add(20);
        //studentList.add(true);

        // tum data turlerinde bilgiyi kabul edecek bir list olusturmak istersek

        List<Object> everyThing = new ArrayList<>();
        everyThing.add("Sevda");
        everyThing.add(24);
        everyThing.add(true);
        everyThing.add('Q');
        System.out.println(everyThing);

        System.out.println(((String) (everyThing.get(0))).charAt(0));

        System.out.println((Integer) everyThing.get(1) * 2);

        if ((Boolean) everyThing.get(2)){
            System.out.println("Merhaba");
        }else {
            System.out.println("Hoscakal");
        }

        Iterator<String> name;

    }

}
