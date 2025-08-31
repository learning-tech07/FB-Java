package Assignment1;
import java.util.Scanner;
public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = n;
        int r = 0;
        int ld;
        while(n > 0){
            ld = n%10;
            r = r*10 + ld;
            n = n/10;

        }
        if(o == r){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
