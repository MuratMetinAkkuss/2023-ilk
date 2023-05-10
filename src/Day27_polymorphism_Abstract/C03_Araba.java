package Day27_polymorphism_Abstract;

public abstract class C03_Araba {
    /*
        Parent class'da istedgimiz her hangi bir methodu Child class'larin tumu
        OVERRIDE etmek zorunda kalsin istiyorsak
         o method'u ABSTRACT etmemiz gerekir

        Eger ABSTRACT yapilan bir method
        Tum child class'lar tarafindan override edilecekse
        parent class'daki abstract method
        hic bir zaman CALISMAYACAKTIR.
        override edildigi icin guncel olan
        child class'lardaki overrideing method'lar calisacaktir.
        o zaman ABSTRACT METHOD'LARIN body'ye ihtiyaci YOKTUR.

        Bir class abstract yapilip icerisine abstract method'lar konursa
        o class'i parent edinen tum child class'lar
        parent class'daki abstract method'lari OVERRIDE ETMELIDIR!!
        aksi durumda CTE olusur.


     */
    abstract void teker();

    abstract void motor();

    abstract void gosterge();

    void guvenlik() {
        System.out.println("arabalarin guvenlik olnlemleri olsa iyi olur");
    }

    void klima() {
        System.out.println("arabalarin klimalari olabilir.");
    }
}
