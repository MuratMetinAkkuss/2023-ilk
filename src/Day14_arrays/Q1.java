package Day14_arrays;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        String [] arr1 = {"sevda","selim"};

        int[]arr= {2,4,6,8,1,3,2};

        System.out.println(Arrays.toString(arr));
        System.out.println(" ");

        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i] + "-");
        }
        System.out.println(arr[arr.length-1]);

    }
}
