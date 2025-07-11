package DSA_Array;

public class Array006 {
    public static void main(String[] args) {
        //Array Programme
        int[] marks={23,12,22,12,11,21,45,65,76,44};

        //Q1:- print that students roll number <35 of student index and number
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<35){
                System.out.print(marks[i]+" ");
            }
        }
    }
}
