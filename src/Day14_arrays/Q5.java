package Day14_arrays;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        //verilen string bir arrey'de
        //en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] arr = {"saida","isa","asil","kubra","elif"};
        buyuk(arr);
    }
    public static void buyuk(String[]arr){
        String buyuk = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (buyuk.length()<arr[i].length()){
                buyuk = arr[i];
            }
        }
        System.out.println("en uzun isim:" + buyuk);
    }
}
