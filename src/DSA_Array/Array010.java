package DSA_Array;

import java.util.Scanner;

public class Array010 {
    public static void main(String[] args) {
        //find the max and second max
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size:-");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array List Item's:-");
            arr[i]=sc.nextInt();
        }
        //for loop for max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("Max value is:-"+max);
        System.out.println("Second Max Value is:-"+smax);
    }
}
