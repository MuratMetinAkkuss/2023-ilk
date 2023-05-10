package Day27_polymorphism_Abstract;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{
    void method1(){

    }
    double method2(){
        //RETURN TYPE void veya primitive data type ise
        //OVERRIDEN method ile OVERRIDING method'un return type'lari
        //AYNI OLMALIDIR.
        return 3;
    }

    String method3(){
        return "Selenium heyecandir.";
    }
    double method4(){
        return 5.6;
    }
    ArrayList<String> method5(){
        //Return type non-primitive ise child class'daki method'un return type'i
        //parent class'daki overriden method'un return type'inin
        // AYNISI veya CHILD CLASS'i olmalidir.
        //IS-A reletionship ile kontrol edilebilir.
        //COVARIANT-----BU KURALA VERILEN ISIMDIR...
        return new ArrayList<>();
    }
}
