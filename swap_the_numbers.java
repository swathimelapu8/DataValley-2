import java.io.*;
public class swap_the_numbers {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 16;

        System.out.println("Before swapping:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        n1 = n1 + n2; 
        n2 = n1 - n2; 
        n1 = n1 - n2; 

        System.out.println("\nAfter swapping :");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
