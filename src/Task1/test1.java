package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int n, p = 1;
        while (true) {
            try {
                System.out.print("Please enter a number of line:");
                n = new Scanner(System.in).nextInt();
                break;
            }catch (InputMismatchException exept){
                System.out.println("Please enter correct number");
            }
        }
        System.out.print(p);
        for (int k = 1; k <= n; k++)
        {
            p *= (n - k + 1);
            p /= k;
            System.out.print(" ");
            System.out.print(p);
        }
    }
}
