package com.google;
import java.lang.*;
import java.util.Scanner;



public class Main {

    public static int NOD(int a, int b) {
        if (b == 0)
            return a;
        return NOD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(NOD(num1,num2));
    }
}

