package br.dev.wesraiuga.practice;

import java.util.*;

public class _02_JavaStdinAndStdout1 {
    /*
        Java Stdin and Stdout I
        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

        Task
        In this challenge, you must read 3 integers from stdin and then print them to stdout.
        Each integer must be printed on a new line.
        To make the problem a little easier, a portion of the code is provided for you in the editor below.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
