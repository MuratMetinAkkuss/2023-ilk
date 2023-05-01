package Day22_stringBuilder_accessModifier;

public class C03_StringBuilderVeStringMethodlari {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java Candir");
        System.out.println(sb1.substring(5));
        System.out.println(sb1);
        //String methodlari immutable oldugu icin sb yi degistirmez

        System.out.println(sb1.toString().toUpperCase());
        System.out.println(sb1);

        //sb1 = sb1.toString().toUpperCase();

        sb1 = new StringBuilder(sb1.toString().toUpperCase());

        System.out.println(sb1);
        String s1 ="Hurriyet";

        StringBuilder s2= new StringBuilder("Hurriyet");

        StringBuilder sb4 = new StringBuilder("OCAJP8");

        sb4.subSequence(2, 4);
        System.out.println(sb4);

        sb4.deleteCharAt(3);

        sb4.reverse( );

        System.out.println(sb4);

    }

}
