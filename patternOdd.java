
import java.util.Scanner;
public class patternOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half
        for(int i = 0; i <n/2 ;++i){
            System.out.print(" * ");
            for(int m=0;m<n+2;++m){
                System.out.print("   ");
                
            }
            for(int l = 1;l<=i+1;++l){
                    System.out.print(" * ");
                }
                System.out.println();

        }
        //middle line
        for(int p = 0; p<n+3 ; ++p){
            System.out.print(" * ");
        }
        for(int k = 0 ; k<n/2+1 ; ++k){
            System.out.print(" * ");
                
        }         
        System.out.println();
        //lower half
        for(int j = n/2 ; j>0 ; --j){
            System.out.print(" * ");
            for(int k = 0 ; k<n+2 ; ++k){
                System.out.print("   ");
            }
            for(int l = 1 ; l<j+1 ; ++l)
            System.out.print(" * ");
            System.out.println();
        }
        

    }
        
    }
    

