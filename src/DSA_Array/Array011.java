package DSA_Array;

public class Array011 {
    //Create a function in java
    public static void changeArray(int[] arr){
        arr[0]=312;
        arr[1]=422;
        arr[2]=542;
    }
    public static void main(String[] args) {
        //Create Array in Java
        int[] arr={23,53,563,66,32,53};
        System.out.println("Normal Array is:-"+arr[0]);
        System.out.println("Normal Array is:-"+arr[1]);
        System.out.println("Normal Array is:-"+arr[2]);
        System.out.println("Normal Array is:-"+arr[3]);

        //see array output after changing array values;
        System.out.println("=====ARRAY PARSING METHOD=====");
        changeArray(arr);
        System.out.println("Passing Array Method:-"+arr[0]);
        System.out.println("Passing Array Method:-"+arr[1]);
        System.out.println("Passing Array Method:-"+arr[2]);
        System.out.println("Passing Array Method:-"+arr[3]);



    }
}
