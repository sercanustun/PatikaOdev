package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Lütfen doğum yılınızı giriniz : " );
        int year = sc.nextInt ( );
        int remaining = year % 12;

        if ( remaining == 0 )
            System.out.println ( "Çin zodyağı burcunuz : Maymun" );
        else if ( remaining == 1 )
            System.out.println ( "Çin zodyağı burcunuz : Horoz " );
        else if ( remaining == 2 )
            System.out.println ( "Çin zodyağı burcunuz : Köpek " );
        else if ( remaining == 3 )
            System.out.println ( "Çin zodyağı burcunuz : Domuz" );
        else if ( remaining == 4 )
            System.out.println ( "Çin zodyağı burcunuz : Fare" );
        else if ( remaining == 5 )
            System.out.println ( "Çin zodyağı burcunuz : Öküz" );
        else if ( remaining == 6 )
            System.out.println ( "Çin zodyağı burcunuz : Kaplan" );
        else if ( remaining == 7 )
            System.out.println ( "Çin zodyağı burcunuz : Tavşan" );
        else if ( remaining == 8 )
            System.out.println ( "Çin zodyağı burcunuz : Ejderha" );
        else if ( remaining == 9 )
            System.out.println ( "Çin zodyağı burcunuz : Yılan" );
        else if ( remaining == 10 )
            System.out.println ( "Çin zodyağı burcunuz : At" );
        else
            System.out.println ( "Çin zodyağı burcunuz : Koyun" );


    }
}
