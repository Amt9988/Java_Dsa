package DSA_Array;

public class Array01 {
    public static void main(String[] args) {
        //Array
        int[] arr_list={12,32,43,45,23,56,6};
        System.out.println(arr_list);

        //git show all element showing by indexes number
        try {
            System.out.println(arr_list[0]);
            System.out.println(arr_list[1]);
            System.out.println(arr_list[2]);
            System.out.println(arr_list[3]);
            System.out.println(arr_list[4]);
            System.out.println(arr_list[5]);
            System.out.println(arr_list[6]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("this java array length is:-"+arr_list.length);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
