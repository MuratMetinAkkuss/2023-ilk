package Day24_inheritance;

public class FCoralla extends EToyata{
    FCoralla(){

        System.out.println("coralladan selam");
    }
    String modelCoralla="Coralla";

    public static void main(String[] args) {
        FCoralla coralla1 = new FCoralla();
        System.out.println(coralla1.modelCoralla);
        System.out.println(coralla1.markaToyata);
        System.out.println(coralla1.motorAraba);


        /*
            Bir obje olusuturldugunda
            class level'da var olan variable'larin
            bir kopyasi olusturulup objeye ilisiklendirilir.

            bir class'da gorunur bir constructor yoksa o class'da
            default constructor vardir
            Java inheritance'da obje olusturuldugunda
            parent class'lardaki constructor'larinda calismasi icin
            buna benzer bir mekanizma olusturmustur.

            extends keyword kullanilan bir class'da var olan
            her constructor'in ilk satirinda gorunur bir constructur
            call yoksa gorunmeyen bir super() constructor call vardir

            super(): parametresiz constructor call icin kullanilir
         */
    }
}
