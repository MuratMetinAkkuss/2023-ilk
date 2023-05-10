package Day27_polymorphism_Abstract;

public class C05_Nissan extends C03_Araba{
    public static void main(String[] args) {

        /*
            Abstrac class'lar yokken class'larimiza ozel bir isim vermedik
            Ama abstract class'lar devreye girince
            class turunu belirtmek icin abstract olmayan class'lara
            CONCRETE class denir

            Bugune kadar bizim olusturudugumuz tum class'lar CONCRETE class'dir
            Conrete/class veya method'lara concrete yazilmaz
            sadece class/method'dan bahsederken
            abstract olmadigini vurgulamak icin concrete class/method deriz.



         */

        C05_Nissan nissan1 = new C05_Nissan();
        nissan1.gosterge();
        nissan1.guvenlik();
        nissan1.klima();
        nissan1.motor();
        nissan1.teker();

        C03_Araba nissan2 = new C05_Nissan();
        nissan1.gosterge();
        nissan1.guvenlik();
        nissan1.klima();
        nissan1.motor();
        nissan1.teker();
    }

    @Override
    void teker() {
        System.out.println("Nissan araclar lassa kullanir.");
    }

    @Override
    void motor() {
        System.out.println("Nissan araclar renault kullanir.");
    }

    @Override
    void gosterge() {
        System.out.println("Nissan araclarda 20 tane gosterge vardir.");
    }


}
