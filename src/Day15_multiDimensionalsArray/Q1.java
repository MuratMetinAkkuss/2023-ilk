package Day15_multiDimensionalsArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        //array uzunlugu degistirilemedigi icin calisma ortaminda tercih edilmez
        //asagidaki arr'e element olarak 10 ekleyeleim

        //erilen bir arrayde elementrleriyazdirin
        //ancak tekrar edilen elementler varsa tekraredeni bir kez yazdirin

        int[] sayilar = {3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6};

        List<Integer> tekrarsizlist = new ArrayList<>();

        for (int  i = 0;  i < sayilar.length ;  i++) {

                if (!tekrarsizlist.contains(sayilar[i])){
                    tekrarsizlist.add(sayilar[i]);
                }
        }
        System.out.println(tekrarsizlist);

    }
}
