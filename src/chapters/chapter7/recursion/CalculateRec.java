package chapters.chapter7.recursion;

import java.util.Scanner;

public class CalculateRec {
    static int calculateGCD(int num1, int num2) {
        if (num2 != 0)
            return calculateGCD(num2, num1 % num2);
        else
            return num1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the first positive integer value: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the second positive integer value: ");
        int num2 = sc.nextInt();
        System.out.print("The greatest common divisor of " + num1 + " and " + num2 + " is " + calculateGCD(num1, num2));
        sc.close();
    }
}

