package Day27_polymorphism_Abstract;

public class C04_Toyata extends C03_Araba{

    public static void main(String[] args) {
        /*
            Satisa cikan tum araclar icin somut degerler atanmali
            Child class'lar parent class'daki TUM METHOD'LARI OVERRIDE
            ETMEK ZORUNDA olsun

            Normal parent child iliskisinde MECBURIYET OLMAZ
            Child class isterse OVERRIDE eder, isterse etmez

            ABSTRACTION'IN temel amaci
            Child class'larin mutlaka kendisine uyarlamasi gereken method'lari
            override edilmesini SAGLAMAKTIR.
         */
        C04_Toyata arac1 = new C04_Toyata();
        arac1.teker();
        arac1.klima();
        arac1.motor();


    }


    @Override
    void teker() {
        System.out.println("Toyata araclar pirelli teker kullanir.");
    }

    @Override
    void motor() {
        System.out.println("Toyata araclar cevreci motor kullanir");
    }

    @Override
    void gosterge() {
        System.out.println("Toyata araclarin tumunde gosterge vardir");
    }
}
