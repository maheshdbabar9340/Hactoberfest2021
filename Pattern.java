package com.java.pattern;
import java.util.Scanner;

public class Pattern2 {

    public static void printReversePattern(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the value of N: ");
        int n = scan.nextInt();
        printReversePattern(n);
    }
}
