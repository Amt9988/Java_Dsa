package DSA_Array;

import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        //Java Array class to take input to user and print details
        int[] arr=new int[5];

        //take input in array define scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" nos");

        //take in array to using loops method
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            System.out.println("Here is what you entered");
        }

        //print array list item
        for(int x:arr){
            System.out.println("Output Items is:-"+x);
        }
    }
}
