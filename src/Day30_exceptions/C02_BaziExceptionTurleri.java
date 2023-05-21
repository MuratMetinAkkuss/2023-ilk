package Day30_exceptions;

public class C02_BaziExceptionTurleri {
    public static void main(String[] args) {
        String str = null;//null bir pointer'dir, deger degildir.

        // null olarak isaretlenmis strignin degeri olmadigi icin concat ile
        //deger atamasi yapilirsa NullPointerExceptions verir

        String a = "34";
        String b = "55";
        //a ve b variable'larindaki sayilarin toplamini yazdirin
        //sadece sayi olmayan bir stringi number formatina cevirmeye kalkarsak
        //bize NumberFormatException verecektir
        //String a = "34a"; seklinde ornekteki a'nin verilmesi gibi

        int sonuc = Integer.parseInt(a) + Integer.parseInt(b);

        System.out.println(sonuc);


        String str1 = "Java";
        Object obj = str;
        Integer sayi = (Integer) obj;
        //ClassCastException

    }
}
