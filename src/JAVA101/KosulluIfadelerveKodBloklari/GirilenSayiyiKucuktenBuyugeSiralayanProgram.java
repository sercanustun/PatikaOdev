package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class GirilenSayiyiKucuktenBuyugeSiralayanProgram {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1. Sayiyi Giriniz :");
        num1 = sc.nextInt();
        System.out.println("Lütfen 2. Sayiyi Giriniz :");
        num2 = sc.nextInt();
        System.out.println("Lütfen 3. Sayiyi Giriniz :");
        num3 = sc.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.println("1.Sayi < 2. Sayi < 3.Sayi");
            } else
                System.out.println("1.Sayi < 3. Sayi < 2. Sayi");
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println("2.Sayi < 1.Sayi < 3.Sayi");
            } else
                System.out.println("2.Sayi < 3. Sayi < 1. Sayi");
        } else if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                System.out.println("3.Sayi < 1.Sayi < 2.Sayi");
            } else
                System.out.println("3.Sayi < 2.Sayi < 1.Sayi");
        }
    }
}