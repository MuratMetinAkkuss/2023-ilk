package Day17_constructors;

public class C05_hastane {

    public C05_hastane(){System.out.println("burasi constructor scopu");
    }



    String hastaneAdi = "Yildiz hastanesi";
    String hastaneTelefonu = "3234224123";
    String personelIsmi = "Isim belirtilmedi";
    String personelAdres = "adres belirtilmedi";
    String personelTelefon = "telefon belirtilmedi";
    String personelTuru = "presonel turu belirtilmedi";
    public int maas(){

        switch (personelTuru){
            case "Doktor" :
                return 5000;
            case "hemsire" :
                return 3000 ;
            case "bashemsire" :
                return 40000;
            default:
                return 1900;
        }
    }
}
