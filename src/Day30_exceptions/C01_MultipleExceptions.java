package Day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {
    public static void main(String[] args)  {
        try {

            FileInputStream fis = new FileInputStream("src/Day30_exceptions/deneme.txt");
            int k = 0;
            while ((k = fis.read() ) != (-1)){
                System.out.println((char) k );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu hatali erisilemedi.");
        } catch (IOException e) {
            System.out.println("Dosyaya erisim ve okuma ile ilgili hata var.");
        }

        /*
        eger parent child iliskisi olan birden fazla exception
        olan turu handle etmek istersek
        try catch ile
        1- ic ice iki try catch blogu olusturabiliriz

        2- eger bir try birden fazla catch blogu olusturacaksak
           once child exception icin exception blogu yazmaliyiz
           cunku parenttan sonra child yazilirsa, parent child'in
           exception ozelliklerini kapsayarak yakalayacagi icin
           java bizden child class'a ait catch'i silmemizi ister


         */

    }
}
