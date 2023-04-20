package Day14_arrays;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        String str = "Java yilin bu zamanlarinda bir baska guzel oluyor, java olmadan java ogrenilmez";

        //kac tane 'java' geciyor var

        String[] arr =str.split(" ");
        System.out.println(Arrays.toString(arr));

        kacTane(arr ,"da");

        int sayac = 0 ;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase("java")){
                sayac++;
            }

        }
        System.out.println("sitring icerisinde " + +sayac + " tane java vardir");

    }
    public static void kacTane(String[]arr , String arama){
        int sayac = 0 ;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase(arama)){
                sayac++;
            }

        }
        System.out.println("sitring icerisinde " + sayac + " tane " +"'"+arama+"'"+" vardir");
    }
}
