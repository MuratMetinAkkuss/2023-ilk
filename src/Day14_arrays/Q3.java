package Day14_arrays;

public class Q3 {
    public static void main(String[] args) {
        //array'de kac tane cift sayi oldugunu yazin
        int[]arr= {2,4,6,8,1,3,8,2};
        cift(arr);
    }
    public static void cift(int[] arr){
        int sayac = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 == 0){
                sayac += 1 ;
            }
        }
        System.out.println(sayac +" tane cift sayi vardir.");

        sayac = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=4&&arr[i]<=8){
                sayac += 1 ;
            }
        }
        System.out.println("4 dahil ve 8 dahil arasinda sayi miktari: "+ sayac);
    }
}
