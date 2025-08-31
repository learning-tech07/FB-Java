package Classwork;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        while(n>0){
        int d = n%10;
        num = (num+d)*10;
        n = n/10;
        }
        num = num / 10; // To remove the last zero added in the loop
        System.out.println(num);
    }
    
}
