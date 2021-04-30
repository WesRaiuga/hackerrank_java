package br.dev.wesraiuga.practice;

import java.util.Scanner;
import java.util.regex.*;

public class _06_JavaLoops1 {
    /*
        Java Loops I
        https://www.hackerrank.com/challenges/java-loops-i/problem

        Task
        Given an integer, N, print its first 10 multiples.
        Each multiple N x i (where 1 < i < 10) should be printed on a new line in the form: N x i = result.

        - Input Format
        A single integer, N.

        - Constraints
        2 < N < 20

        - Output Format
        Print 10 lines of output; each line i (where 1 < i < 10) contains the result of N x i in the form:
        N x i = result.
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        printMultiplication(n);
    }

    private static void printMultiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

}
