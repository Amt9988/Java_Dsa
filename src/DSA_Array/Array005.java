package DSA_Array;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        //Define Scanner Class
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Length Number:-");
        int ln=sc.nextInt();
        System.out.println(" ");

        //define Array for store data
        int[] arr=new int[ln];

        //define Array for how to insert data by using loops method
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr of "+(i+1)+" to Store:-");
            arr[i]=sc.nextInt();
        }

        //for Break line of Input line
        System.out.println();
        System.out.println("======Output is Here========");
        System.out.println(" ");
        for (int x:arr){
            System.out.println("Array List Item is:-"+x);
        }
    }
}
