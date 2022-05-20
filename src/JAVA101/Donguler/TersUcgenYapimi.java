package JAVA101.Donguler;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("Üçgen kaç satırdan oluşsun ? ");
        int digit = sc.nextInt();

        for (int i = digit + 1; i > 0; i--) {

            for (int j = 0; j < temp; j++)
                System.out.print(" ");
            temp++;

            for (int k = 0; k < (i * 2) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
