package ExtraDefineCode;

public class DefineCode01 {
    public static void main(String[] args) {
        int a=23;
        int b=54;
        System.out.println(a);
        System.out.println(b);
        System.out.println("next line of code");
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
