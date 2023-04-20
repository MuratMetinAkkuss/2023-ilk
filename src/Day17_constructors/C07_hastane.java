package Day17_constructors;

public class C07_hastane {
    @Override
    public String toString() {
        return "C07_hastane{" +
                "hastaneAdi='" + hastaneAdi + '\'' +
                ", hastaneTelefonu='" + hastaneTelefonu + '\'' +
                ", personelIsmi='" + personelIsmi + '\'' +
                ", personelAdres='" + personelAdres + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", personelTuru='" + personelTuru + '\'' +
                '}';
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
