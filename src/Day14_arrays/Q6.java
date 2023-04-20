package Day14_arrays;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        //verilen bir array'in tum elamanlarini
        //istenen deger kadar arttirip bize donduren bir method olusturun
        //eski array'i yeni haliyle kaydedin

        int[] arr = {3,5,7,2,1,9};
        int artisMiktari = 5;

        arr = yeni(arr,artisMiktari);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] yeni(int[]ass , int artis){

        for (int i = 0; i < ass.length ; i++) {
            ass[i] = ass[i] + artis ;
        }
        return ass;
    }
}
