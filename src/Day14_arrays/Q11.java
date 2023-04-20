package Day14_arrays;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {

        String str = "ahmet";
        str = "mehmet";

        /*
            array'lerin uzunluklari degistirilemez ama
            bir array'e yeni bir array atamasi yapabilirsiniz
         */

        String[] arr1 = {"ali","veli"};
        String[] arr2 = {"A","B","C"};

        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));

        //eski bir array'e atama yapamayiz ama yeni bir array olusturup
        //assign edebiliriz.
        arr1 = new  String[6];
        System.out.println(Arrays.toString(arr1));

    }
}
