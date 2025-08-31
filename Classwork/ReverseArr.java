package Classwork;
import java.util.Arrays;
public class ReverseArr {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        
        // for (int i = 0; i<marks.length; i++) {
        //     System.out.println("Elements at index " + i + ": " + marks[i]);
        // }

        for (int i = marks.length-1; i>=0 ; i--){
            System.out.print( marks[i]+" ");
        }
        
    }
    
}
