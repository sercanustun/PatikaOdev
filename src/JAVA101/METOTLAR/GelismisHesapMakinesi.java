package JAVA101.METOTLAR;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        String menu = "1-Toplama işlemi \n" +
                "2-Çıkarma işlemi \n" +
                "3-Çarpma işlemi \n" +
                "4-Bölme işlemi \n" +
                "5-Üstlü Sayı Alma \n" +
                "6-Faktoriyel Hesaplama \n" +
                "7-Mod Alma \n" +
                "8-Diktörtgenin Alan ve Çevresinin Hesabı \n" +
                "0-Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.println("Lütfen bir işlem seçiniz");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    plus();
                case 2:
                    minus();
                case 3:
                    multiple();
                case 4:
                    divide();
                case 5:
                    exponential();
                case 6:
                    factorial();
                case 7:
                    mod();
                case 8:
                    square();

                default:
                    System.out.println("Yanlış bir değer girdiniz");
            }


        } while (select != 0);
    }

    private static void square() {
        int mini, maxi, area = 1, environment = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dörtgenin kısa kenarını giriniz");
        mini = scanner.nextInt();
        System.out.println("Lütfen dörtgenin uzun kenarını giriniz ");
        maxi = scanner.nextInt();
        area = mini * maxi;
        environment = 2 * (mini + maxi);
        System.out.println("Dörtgenin alanı =  " + area + "Dörtgenin çevresi = " + environment);
    }

    private static void mod() {
        int bottom, top, result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bölünen sayıyı giriniz");
        bottom = scanner.nextInt();
        System.out.println("Lütfen bölen sayıyı giriniz ");
        top = scanner.nextInt();
        result = bottom % top;
        System.out.println("Verilen sayının modu " + result);
    }

    private static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void exponential() {
        int bottom, top, result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üstü alınacak sayıyı giriniz");
        bottom = scanner.nextInt();
        System.out.println("Lütfen üstü giriniz ");
        top = scanner.nextInt();

        for (int i = 0; i < top; i++) {
            result *= bottom;
        }

        System.out.println("Üstlü sayının sonucu = " + result);
    }

    private static void divide() {
        int number, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kere bölme işlemi yapacaksınız");
        int numOfNumbers = scan.nextInt();
        System.out.println("Lütfen bölünen sayıyı giriniz");
        int dividing = scan.nextInt();

        for (int i = 1; i <= numOfNumbers; i++) {
            System.out.println("Lütfen bölen sayıyı giriniz");
            number = scan.nextInt();
            if (number == 0) {
                System.out.println("Bölen sayı 0 olamaz !!! Bu bölen es geçildi.");
            } else {
                dividing /= number;
                result = dividing;
            }
        }
        System.out.println("Bölme işleminin sonucu = " + result);
    }

    private static void multiple() {
        int number, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet çarpma işlemi yapacaksınız");
        int numOfNumbers = scan.nextInt();

        for (int i = 1; i <= numOfNumbers; i++) {
            System.out.println("Lütfen sayıyı giriniz");
            number = scan.nextInt();
            result *= number;
        }
        System.out.println("Çarpma işleminin sonucu = " + result);
    }

    private static void minus() {
        int number, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vereceğiniz sayıdan kaç adet sayı çıkarmak istersiniz");
        int numOfNumbers = scan.nextInt();
        System.out.println("Lütfen eksiltilecek sayıyı giriniz");
        int firstNumber = scan.nextInt();

        for (int i = 1; i <= numOfNumbers; i++) {
            System.out.println("Lütfen sayıyı giriniz");
            number = scan.nextInt();
            firstNumber -= number;
            result = firstNumber;
        }
        System.out.println("Çıkarma işleminin sonucu = " + result);


    }

    private static void plus() {
        int number, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayıyı toplamak istiyorsunuz");
        int numOfNumbers = scan.nextInt();

        for (int i = 1; i <= numOfNumbers; i++) {
            System.out.println("Lütfen sayıyı giriniz");
            number = scan.nextInt();
            result += number;
        }

        System.out.println("Verdiğiniz sayıların toplamı = " + result);


    }


}
