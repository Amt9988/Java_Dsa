package DSA_Array;

import java.util.Scanner;

public class Array007 {
    public static void main(String[] args) {
        //take input to users
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size:-");
        int n=sc.nextInt();
        int[] arr=new int[n];

        //add take input of users in array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Item's:-");
            arr[i]=sc.nextInt();
        }

        System.out.println("----Output----");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        //total array items calculate sum
        // Declare variable in java to sum name
        System.out.println("Calculate the sum of Array list below ");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Total sum of Array:-"+sum);
    }
}
