package Day18_PassByValue;

public class E2_Varargs {
    public static void main(String[] args) {
        new E2_Varargs().E2_Varargs(1,"Java");

        E2_Varargs obj = new E2_Varargs();
        obj.E2_Varargs(2,"Java","Guzeldir");
    }

    private void E2_Varargs(int a, String... b) {
        System.out.println(b[b.length - a] + " ");
    }
}
