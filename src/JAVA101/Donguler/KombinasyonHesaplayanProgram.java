package JAVA101.Donguler;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Lütfen n sayısını giriniz" );
        int n = sc.nextInt ( );
        System.out.println ( "lÜtfen r sayısını giriniz" );
        int r = sc.nextInt ( );
        int totalN = 1;
        int totalR = 1;
        int totalNMinusR = 1;

        for (int i = 1; i <= n; i++) {
            totalN = totalN * i;
        }

        for (int i = 1; i <= r; i++) {
            totalR = totalR * i;
        }

        for (int i = 1; i <= ( n - r ); i++) {
            totalNMinusR = totalNMinusR * i;
        }
        double combination = totalN / ( totalR * totalNMinusR );
        System.out.println ( combination );
    }
}
