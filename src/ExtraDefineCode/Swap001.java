package ExtraDefineCode;

public class Swap001 {
    public static void main(String[] args) {
        int fNum=23;
        int lNum=45;
        System.out.println("First Number is:-"+fNum);
        System.out.println("Last Number is:-"+lNum);

//        fNum=lNum;
//        lNum=fNum;

            lNum=fNum;
            fNum=lNum;
        System.out.println("After Swap first Number is:-"+fNum);
        System.out.println("After Swap last Number is:-"+lNum);
    }
}
