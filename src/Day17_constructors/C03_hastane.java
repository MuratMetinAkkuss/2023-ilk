package Day17_constructors;

public class C03_hastane {
    String hastaneAdi = "Yildiz hastanesi";
    String hastaneTelefonu = "3234224123";
    String personelIsmi = "Isim belirtilmedi";
    String personelAdres = "adres belirtilmedi";
    String personelTelefon = "telefon belirtilmedi";
    String PersonelTuru = "presonel turu belirtilmedi";
    public int maas(String personelTuru){

        switch (personelTuru){
            case "Doktro" :
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
