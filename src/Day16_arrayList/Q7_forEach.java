package Day16_arrayList;

public class Q7_forEach {
    public static void main(String[] args) {
        int[] arr = {2,4,1,4,2,1,2};

        elemanlariToplama(arr);

    }

    public static void elemanlariToplama (int[] arr){

        int toplam = 0 ;

        for (int each: arr
             ) {
            toplam = toplam + each *each;
        }
        System.out.println(toplam);

    }
}
