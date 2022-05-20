package JAVA101.Donguler;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int i, num;
        int count = 0;
        int toplam = 0;
        System.out.println ( "Lütfen bir sayı giriniz" );
        num = sc.nextInt ( );
        for (i = 1; i <= num; i++) {
            if ( i % 3 == 0 || i % 4 == 0 ) {
                count++;
                System.out.println ( i );
                toplam += i;
                System.out.println ( toplam + " TOPLAM DEĞER" );
            }

        }

        Double avg = Double.valueOf ( toplam / count );
        System.out.println ( "ORTALAMASI " + avg );


    }
}

