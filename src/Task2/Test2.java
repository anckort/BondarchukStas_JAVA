package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int n = input("n");
        int a = input("a");
        int b = input("b");

        print(n, a, b);
    }

    public static int input(String s) {
        while (true) {
            try {
                System.out.print("Input " + s + ": ");
                return new Scanner(System.in).nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Wrong number!");
            }
        }
    }

    private static void print(int n, int a, int b) {
        int sum = 0;
        int[] coefficient = getCoef(n);
        for (int i = 0, j = n; i <= n; i++, j--) {

            int var = 1;
            String coefficients = "";
            if (coefficient[i] != 1) {
                coefficients = String.valueOf(coefficient[i]);
                var *= coefficient[i];
            }
            System.out.print(coefficients);

            if (j != 0) {
                if (j != 1) {
                    System.out.print("a^" + j);
                    var *= Math.pow(a, j);
                } else {
                    System.out.print("a");
                    var *= a;
                }
            }

            if (i != 0)
                if (i == n && n != 1) {
                    System.out.print("b^" + i);
                    var *= Math.pow(b,i);
                }
                else {
                    if (i != 1) {
                        System.out.print("*b^" + i);
                        var *= Math.pow(b,i);
                    }
                    else {
                        if (n == 1)
                            System.out.print("b");
                        else
                            System.out.print("*b");
                        var *= b;
                    }
                }
            if (i != n)
                System.out.print("+");
            sum+=var;
        }
        System.out.print("=" + sum);
    }

    private static int[] getCoef(int n){
        int x = 1;
        int[] coef = new int[n + 1];
        for (int i = 0; i <= n; i++){
            coef[i] = x;
            x*= (n - 1)/(i + 1);
        }
        return coef;
    }

}
