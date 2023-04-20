package Day16_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(deneme());
    }

    public static List<String> deneme(){

        List<String> isimler = new ArrayList<>();
        String kullaniciGirdisi  = "";

        do {
            System.out.println("enter input");
            kullaniciGirdisi = scanner.nextLine();
            if (!kullaniciGirdisi.equals("0")){
                isimler.add(kullaniciGirdisi);
            }
        } while (!kullaniciGirdisi.equals("0"));
        return isimler;
    }

}
