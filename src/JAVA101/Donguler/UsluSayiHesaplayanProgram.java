package JAVA101.Donguler;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Lütfen üssü hesaplanacak sayıyı giriniz " );
        int num = sc.nextInt ();
        System.out.println ("Lütfen üssü giriniz " );
        int pow = sc.nextInt ();
        int total = 1 ;

        for (int i = 1;i<=pow ; i++) {
            total *=num;
        }
        System.out.println ("Üslü sayının sonucu = " + total );
    }
}
