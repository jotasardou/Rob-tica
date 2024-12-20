package com.hackerrank.exercicios;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        scanner.close();
    }
}


