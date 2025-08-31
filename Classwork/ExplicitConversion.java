package Classwork;
public class ExplicitConversion {
    public static void main(String[] args) {
        double doubleNum = 99.99;
        int intNum = (int) doubleNum; // Explicit conversion from double to int

        int bigValue = 300;
        byte smallValue = (byte) bigValue; // Explicit conversion from int to byte

        System.out.println("Double value: " + doubleNum);
        System.out.println("Int (after casting ): " + intNum);
        System.out.println("Int 300 to Byte(after casting): " + smallValue);
    
    }
    
}
