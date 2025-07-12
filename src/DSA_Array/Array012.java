package DSA_Array;

import java.util.Scanner;

public class Array012 {
    public static void main(String[] args) {
        //Q:-Find the doublet in the Array whose sum is equal to the give value x.(two sum)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array:-");
        int len=sc.nextInt();

        System.out.println();
        int[] arr=new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Number in ArrayList:-");
            arr[i]=sc.nextInt();
        }

        //show result of array list items
        System.out.println();
        for (int x:arr){
            System.out.print(" "+x);
        }
    }
}
