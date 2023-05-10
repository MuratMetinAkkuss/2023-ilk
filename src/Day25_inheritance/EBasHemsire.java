package Day25_inheritance;

public class EBasHemsire extends DHemsire{
    EBasHemsire(){
        System.out.println(adres);
        adres = "Cankaya";
        System.out.println(gorev);
        System.out.println(super.gorev + " Genel gorev");
        isim = "Ayse";
        System.out.println(this.isim);
        System.out.println(super.isim);
        this.maas();
        super.maas();
        this.nobet();
        super.nobet();
        this.ozelSigorta();
        super.ozelSigorta();
    }
    String gorev = "bas hemsire";
    String adres = "Adres belirtilmedi";

    public void maas(){
        System.out.println("bas hemsire maasi: " + 3000 );
    }
    public void nobet(){
        System.out.println("Bas Hemsireler haftada 2 gun nobet tutar");
    }
    public void tazminat(){
        System.out.println("Bas hemsireler 13. maas alirm");
    }

    public static void main(String[] args) {
        EBasHemsire eBasHemsire = new EBasHemsire();
        System.out.println(eBasHemsire.adres);


    }
}
