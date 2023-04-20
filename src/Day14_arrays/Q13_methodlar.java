package Day14_arrays;

import java.util.Arrays;

public class Q13_methodlar {
    public static void main(String[] args) {
      int [] sayiArray = {2,2,7,4,2,4,5,7,3};
      //bir arrayin butun elemanlarina 2 ekleyin
        ekleme(sayiArray, 5);
        toplama(sayiArray);
    }

    public static void ekleme(int[] arr , int kac){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i]+kac;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void toplama(int[] arr){
        int toplam = 0;
        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println(toplam);

    }
    
    public static void enbuyukenkucuksayi(int[] arr){
        
       Arrays.sort(arr);

        //for (int i = 0; i < ; i++) {
            
        //}
    }






}
