package Inheritance;


public class Inherit001 extends InheritHome{
    public static void main(String[] args) {
        Inherit001 Ir=new Inherit001();
        Ir.name="Amit Yadav";
        Ir.course="BCA";
        Ir.Duration=3;

        Inherit001 vr=new Inherit001();
        vr.name="Vishal";
        vr.course="MCA";
        vr.Duration=2;
        vr.ShowResult();

        System.out.println(" ");

        Ir.ShowResult();
    }
}

