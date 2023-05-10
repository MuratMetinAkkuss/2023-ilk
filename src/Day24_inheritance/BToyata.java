package Day24_inheritance;

public class BToyata extends Araba{
    String marka = "Toyata";
    String uretimYeri="Uretim yeri belirtilmedi";
    String lastikBilgisi="Toyata araclar pirelli lastik kullanir";

    public void aku(){
        System.out.println("Toyata araclar inci aku kullanir");
    }

    public void guvenlik(){
        System.out.println("Toyata araclar ekstra guvenlik donanimlarina sahiptir");
    }

}

