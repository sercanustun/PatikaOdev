package JAVA101.METOTLAR;

import java.util.Scanner;

public class RecursiveIleUstHesabiYapanProgram {
    public static void main(String[] args) {
        int bottom, top;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Lütfen taban değerini giriniz :");
            bottom = sc.nextInt();
            System.out.println("Lütfen üst değerini giriniz :");
            top = sc.nextInt();
            System.out.println("İşlemin sonucu = " + recursive(bottom, top));
        }
    }

    private static int recursive(int bottom, int top) {

        if (top == 0) {
            return 1;
        } else {
            return bottom * recursive(bottom, top - 1);
        }
    }
}
