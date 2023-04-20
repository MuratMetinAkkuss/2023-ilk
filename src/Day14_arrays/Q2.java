package Day14_arrays;

public class Q2 {
    //verilen int [] in tum elementlerini toplayip
    //sonucu yazdiran bir method olsun
    public static void main(String[] args) {
        int[]arr= {2,4,6,8,1,3,8,2};
        toplama(arr);
    }
    public static void toplama(int[]arr){
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println("Toplam: "+toplam);
    }
}
