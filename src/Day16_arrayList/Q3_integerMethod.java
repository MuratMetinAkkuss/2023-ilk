package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Q3_integerMethod {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //kullanicidan integer list olusturup donduren bir method olusturun
        System.out.println(getAccessInt());
    }

    public static List<Integer> getAccessInt(){

        System.out.println("Enter size value");
        int size = scanner.nextInt();
        List<Integer> numb = new ArrayList<>();

        for (int i = 0; i < size ; i++) {
            System.out.println("Enter integer value");
            Integer num = scanner.nextInt();
            numb.add(num);
        }
        return numb;
    }

}
