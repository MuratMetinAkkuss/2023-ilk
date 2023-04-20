package Day17_constructors;

public class C04_hastaneRunner {
    public static void main(String[] args) {
        C03_hastane per1 = new C03_hastane();

        System.out.println(per1.personelIsmi);
        per1.personelIsmi = "hurhayat";
        per1.PersonelTuru = "doktor";
        System.out.println(per1.maas("doktor"));

    }
}
