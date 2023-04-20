package Day14_arrays;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {

        /*
            bir arrayin en buyuk ve en kucuk elemanini yazdirin
         */
        int [] arr = {3,6,8,5,4,3,4,6,7,5,3,2,6,8,9,3};
        enBuyukEnKucuk(arr);

        String [] arrStr = {"ali","veli","cali"};
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));


    }

    public static void enBuyukEnKucuk(int [] arr){

        Arrays.sort(arr);

        System.out.println(arr[0] +" en kucuktur.");
        System.out.println(arr[arr.length-1] + " en buyuktur.");

    }




}
