package Day22_stringBuilder_accessModifier;

public class C02_stringBuilderMethodlari {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");

        String str = " Bugun hava cok guzeel";

        sb1.append(str,2,6);
        System.out.println(sb1);

        sb1.append("Java",2,3);
        System.out.println(sb1);

        sb1.replace(5,7,"Selenium");
        System.out.println(sb1);

        sb1.replace(5,sb1.length(),"Candir");
        System.out.println(sb1);

        sb1.replace(0,5,"Selenium");
        sb1.insert(8," Heye");
        System.out.println(sb1);

        sb1.delete(13,14);
        System.out.println(sb1);
        sb1.insert(13,"c");
        System.out.println(sb1);
        /*
        int indexOfC = sb1.indexOf("C");
        sb1.deleteCharAt(indexOfC);
        System.out.println(sb1);

         */

        sb1.insert(0,"Bu");
        sb1.insert(2," ");
        System.out.println(sb1);


        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3 = new StringBuilder("Bu Java Candir");
        System.out.println(sb1.compareTo(sb3));

        StringBuilder sb4 = new StringBuilder("Bu saha Candir");
        System.out.println(sb1.compareTo(sb4));


    }
}
