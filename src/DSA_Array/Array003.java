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

        //show arraylist items by using for loops create project for practice
        for(int x:arr){
            System.out.println(x);
        }

        //create new java array and set value in "String"
        String[] str=new String[]{
                "Amit","Vishal","Rahul","Pankaj"
        };

        //Output showing by programme index number
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);

        //set value in index number of 5 in java Array
        str[3]="Mia Khalifa";
        for (int i = 0; i < str.length; i++) {
            System.out.print(" "+str[i]);
        }

        //show list items using loops in java programme
        for(String x:str){
            System.out.println(" this str list:-"+x);
        }
    }
}