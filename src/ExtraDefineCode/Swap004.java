package ExtraDefineCode;

import java.util.Scanner;

public class Swap004 {
    public static void main(String[] args) {
        // take input and run swap programme
        Scanner sc=new Scanner(System.in);
        //Scanner Define for num a;
        System.out.print("Enter number a:-");
        int a=sc.nextInt();

        //Scanner Define for num b;
        System.out.print("Enter number b:-");
        int b=sc.nextInt();

        //Show result before swaping number
        //define temp variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("=======Swaping Result============");
        System.out.println("After swaping number a is:-"+a);
        System.out.println("After swaping number b is:-"+b);
    }
}
