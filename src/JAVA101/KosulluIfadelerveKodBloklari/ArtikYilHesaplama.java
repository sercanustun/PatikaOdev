package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int year;
        System.out.println ( "Lütfen yıl giriniz : " );
        year = sc.nextInt ( );

        if ( year % 4 == 0 ) {
            if ( year % 100 == 0 ) {
                if ( year % 400 == 0 )
                    System.out.println ( year + " Artıl Yıldır." );
                else
                    System.out.println ( year + " Artık Yıl Değildir." );
            } else
                System.out.println ( year + " Artıl Yıldır." );
        } else
            System.out.println ( year + " Artık Yıl Değildir." );


    }
}
