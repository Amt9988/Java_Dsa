package DSA_Array;

import java.util.Scanner;

public class Array008 {
    public static void main(String[] args) {
        //search item is Array exist or not in array;
        System.out.println("----Array Size----");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size:-");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Array Items:-");
            arr[i]=sc.nextInt();
        }


        //Search Element to user take input
        System.out.println();
        System.out.print("Enter Search Element:-");
        int search=sc.nextInt();

        //create a flage
        boolean flage=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==search){
                flage=true;
            }
        }

        if (flage==false){
            System.out.println("Element is not found");
        }else {
            System.out.println("Element is found:-"+search);
        }
    }
}
