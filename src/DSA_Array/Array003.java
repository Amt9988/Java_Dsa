package DSA_Array;

public class Array003 {
    public static void main(String[] args) {
        //Java Array
        //method 01 of Array
        int[] arr=new int[]{
          34,
          32,
          53,
          64,
          22,
          53
        };

        //print array details using indexing number
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //Array prints by using for loops
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Arraylist Items is:-"+arr[i]);
        }

        //show arraylist items by using for loops
        for(int x:arr){
            System.out.println("Using for loops print list items:-"+x);
        }


    }
}