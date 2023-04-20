package Day14_arrays;

import java.util.Objects;

public class Q7 {

    /*
        verilen bir arrey'de
        istenen bir elamanin var olup olmadigini
        ve varsa kac kere kullanildigini bir method ile olusturun
     */

    public static void main(String[] args) {

        String[] sinifListesi = {"Saida","Isa","Asil","Kubra","Elif","Yusuf"};
        String arananIsim = "Isa";
        isim(sinifListesi,arananIsim);
    }

    public static void isim(String[]bir,String iki){
        int sayac = 0 ;

        for (int i = 0; i <bir.length ; i++) {
            if (bir[i].equalsIgnoreCase(iki)){
                sayac +=1;
            }
        }
        System.out.println(sayac + " defa gecmistir");
    }
}
