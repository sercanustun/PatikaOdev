package JAVA101.Donguler;

import java.util.Scanner;

public class HarmonikSayilariBulanProgram {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Lütfen hesaplamak istediğiniz sayıyı giriniz :" );

        int num = sc.nextInt ();
        double total = 0.0;

        for (double i = 1; i <= num; i++) {

            total += ( 1 / i );

        }
        System.out.println ( "Harmonik sayının değeri = " + total );
    }
}
