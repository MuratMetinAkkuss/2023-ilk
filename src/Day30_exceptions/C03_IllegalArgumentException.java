package Day30_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {

    public static void main(String[] args) {

        /*
            kullanicidan yasini alip
            65'den buyukse emekli olabilecegini yazdirin
            eger kullanici 20'den kucuk bir yas girerse
            exception firlatin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        try {
            if (yas < 20) {
                System.out.println("Yas 20'den kucuk olamaz.");
                throw new IllegalArgumentException("yas 20'den kcuuk olamaz");
            } else if (yas < 65) {
                System.out.println("emekli olmaniza " + (65 - yas) + " sene var");
            } else {
                System.out.println("emeklsiiniz");
            }
        /*
        30 satir emeklilik infosu
         */
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
