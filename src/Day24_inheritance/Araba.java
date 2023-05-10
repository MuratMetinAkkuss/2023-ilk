package Day24_inheritance;

public class Araba {
    String marka = "Araba markasi belirtilmedi";
    String model = "Model belirtilmedi";
    int tekerSayisi = 4;


    public void hiz(){
        System.out.println("Arabalar motor ve yakita gore max hiz belirler");

    }
    public void guvenlik(){
        System.out.println("Tum arabalar guvenlik onlemine sahip olmali");

    }


    /*
        bir proje de kod yazmaya basalamadan once tasarim
        yapilmalidir.
        bunlar arasinda nasil bir iliski kurulacagi,
        hangi class'larin parent/child olacaigi dusunulmelidir

        araba ve toyata class'lari obje olusturulmayan parent classlar
        sadece chil class'lari organize etmek icin vardir
        ve ortak ozellikleri belirlemek icin tasarlanan class'lardir


        daha genel ozellikler parent class'lara
        daha spesifik ve o class'a ait ozellikleri child'a koy

        bir ozelligi variable olusturmak ile
        method(dinamik ozellikler) olarak olusturmak arasinda
        kullanimda bir fark
        vardir. (overriding konusunda ele alinacak)


     */
}
