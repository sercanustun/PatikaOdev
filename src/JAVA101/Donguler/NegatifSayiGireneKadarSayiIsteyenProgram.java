package JAVA101.Donguler;

import java.util.Scanner;

public class NegatifSayiGireneKadarSayiIsteyenProgram {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int input = 0;
        int total = 0;
        while (input >= 0) {
            System.out.println ( "Lütfen bir sayi giriniz." );
            input = sc.nextInt ( );
            if ( input % 4 == 0 ) {
                total += input;
            }
            System.out.println ( total );
        }
    }

}
