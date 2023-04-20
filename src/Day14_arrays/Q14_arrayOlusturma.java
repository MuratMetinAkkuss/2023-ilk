package Day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q14_arrayOlusturma {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("please enter digit or integer");
        int size = scanner.nextInt();
        int[] userInt = new int[size];

        int arrayElement = 0;

        for (int i = 0; i <size ; i++) {

            System.out.println("enter digit to create array: ");
            arrayElement = scanner.nextInt();
            userInt[i] = arrayElement;
        }
        System.out.println(Arrays.toString(userInt));
    }

    public static void kullaniciArrayOlusturma(int[]arr){
        System.out.println("please enter digit or integer");
        int size = scanner.nextInt();
        int[] userInt = new int[size];

        int arrayElement = 0;

        for (int i = 0; i <size ; i++) {

            System.out.println("enter digit to create array: ");
            arrayElement = scanner.nextInt();
            userInt[i] = arrayElement;
        }
        System.out.println(Arrays.toString(userInt));
    }

}
