package Day14_arrays;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        /*
            split method'u istedigimiz yerden bir yaziyi bolerek
            parcaciklari array'a atar.
         */

        String str = "Java gercekten cok guzel";

        // kac tane e harfi vardir

        String[] tanetane = str.split("");
        System.out.println(Arrays.toString(tanetane));
        int sayac = 0;

        for (int i = 0; i <tanetane.length ; i++) {

          if (tanetane[i].equals("e")) {
              sayac++;
            }
        }
        System.out.println(sayac+" tane 'e' vardir." );

        arananStringIcindeVarMi(str,"k");


    }

    public static void arananStringIcindeVarMi(String str, String aranan){

        String[] tanetane = str.split("");

        int sayac = 0;

        for (int i = 0; i <tanetane.length ; i++) {

            if (tanetane[i].equals(aranan)) {
                sayac++;
            }
        }
        System.out.println(sayac+" tane "+aranan+" vardir." );
    }

}
