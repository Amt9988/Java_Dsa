package DSA_Array;

import java.util.Scanner;

public class Array013 {

    //Create function for Array Reverse
    public static void Reverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        //take input to user and reverse array all elements
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Length:-");
        int len=sc.nextInt();
        int[] arr=new int[len];

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Array Element:-");
            arr[i]=sc.nextInt();
        }

        System.out.println();
        for(int x:arr){
            System.out.print(" "+x);
        }

        //Reverse Array
        System.out.println();
        Reverse(arr);

        int n= arr.length;
        int i=0, j=n-1;
        System.out.println();
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        Reverse(arr);
    }
}
