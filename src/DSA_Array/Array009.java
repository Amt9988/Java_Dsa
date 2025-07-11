package DSA_Array;

import java.util.Scanner;

public class Array009 {
    public static void main(String[] args) {
        //find the max number in array
        //Take input to user's
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:-");
        int n=sc.nextInt();
        //create array
        int[] arr=new int[n];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Item list:-");
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println();

        //print all array list items is
        for (int x:arr){
            System.out.print(" "+x);
        }
        System.out.println();
        System.out.println("------Max Value-------");


        //declear a max name variable
//        int max=-1;
//        for (int i = 0; i < args.length; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
        System.out.println("Array Maximume value is:-"+max);


    }
}
