package Day14_arrays;

public class Q4 {
    //verilen int[] arrey'deki en buyuk sayiyi bize donduren bir method olusturun
    public static void main(String[] args) {
        int[]arr= {2,4,6,8,1,3,2};
        System.out.println(buyuk(arr));
        System.out.println(kucuk(arr));

    }
    public static int buyuk(int[]arr ){
        int buyuk = arr[0];
        int kucuk = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (buyuk<arr[i]){
                buyuk = arr[i] ;
            }
        }
        return buyuk  ;
    }
    public static int kucuk(int[]arr ){
        int kucuk = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (kucuk>arr[i]){
                kucuk = arr[i] ;
            }
        }
        return kucuk  ;
    }
}
