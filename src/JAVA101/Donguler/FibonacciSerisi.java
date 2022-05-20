package JAVA101.Donguler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int boyut;
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisinin boyutu : ");
        boyut = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int total;
        total = num1 + num2;
        System.out.print("0 1 1");
        for (int i = 0; i < boyut; i++) {

            num1 = num2;
            num2 = total;
            total = num1 + num2;
            System.out.print(" " + total);
        }
    }
}