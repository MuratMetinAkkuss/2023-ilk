package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q5_tamBolenler {
    /*
        girilen bir pozitif sayinin tam bolenlerini liste olarak
        bize donduren bir method yazdirin
     */

    //method sayilardan olusan bir liste dondurecek
    //methodun icine bir sey gondermeliyiz
    public static void main(String[] args) {
        System.out.println(tamBoleneler(5));
    }

    public static List<Integer> tamBoleneler(int sayi){
        List<Integer> tamBolenlerList = new ArrayList<>();

        for (int i = 1; i <= sayi ; i++) {
            if (sayi % i == 0){
                tamBolenlerList.add(i);
            }
        }
       // System.out.println("tam bolenler listeisi : " + tamBolenlerList );
        return tamBolenlerList;
    }

}
