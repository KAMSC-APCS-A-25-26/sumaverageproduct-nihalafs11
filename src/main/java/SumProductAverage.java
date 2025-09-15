/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of sets (n): ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter three numbers: ");
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            double sum = a + b + c;
            double product = a * b * c;
            double average = sum / 3.0;hgghgg

            System.out.println("Set " + (i + 1) + ":");
            System.out.println("  the Sum     = " + sum);
            System.out.println("  the Product = " + product);
            System.out.println("  the Average = " + average);
            System.out.println();
        }

        in.close();
    }
}

