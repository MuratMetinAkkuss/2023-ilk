package Day25_inheritance;

public class FServisHemsiresi extends  DHemsire{
    public static void main(String[] args) {

        FServisHemsiresi servisHemsiresi = new FServisHemsiresi();
        servisHemsiresi.statickOlmayanMethod();


    }

    private void statickOlmayanMethod() {
        nobet();
        this.nobet();
        super.nobet();

        maas();
        this.maas();
        super.maas();

        calismaGunu();
        this.calismaGunu();


    }

    public void nobet(){
        System.out.println("Servis hemsireleri haftada 3 gun nobet tutar");

    }
    public void calismaGunu(){
        System.out.println("Hafta da 4 gun calisirlar");
    }
}
