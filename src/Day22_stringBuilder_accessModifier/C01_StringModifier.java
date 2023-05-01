package Day22_stringBuilder_accessModifier;

public class C01_StringModifier {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");

        sb1.append(" Candir");
        sb1.append(", buna inanmayan mi var ?");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.trimToSize();

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());



    }
}
