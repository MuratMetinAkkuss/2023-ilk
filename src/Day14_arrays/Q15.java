package Day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    /*
          verilen bir array'e bir eleman ekleyip bize donduren bir methodyazin
          eski arreye yeni degeri atayin

     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[]arr={2,4,6,8};
        //int[] newarr=new int[arr.length+1];
        System.out.println(Arrays.toString(ekleme(arr)));

    }
    public static int[] ekleme (int[]arr ){
        System.out.println("eklemek istediginiz degeri giriniz : ");
        int alinan = scanner.nextInt();

        int[] newarr=new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {

            newarr[i]=arr[i];
        }
        newarr[newarr.length-1] = alinan;

        return newarr;
    }
}
