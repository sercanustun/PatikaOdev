package JAVA101.Donguler;

import java.util.Scanner;

public class GirilenSayiyaKadar4unve5inKatlariniBulanProgram {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Lütfen bir sayı giriniz." );
        int input = sc.nextInt (  );


        for (int i=1 ; i <= input ; i*=4)
            System.out.println ("4'ün kuvveti = "+i);

        System.out.println (" ____________________4'ÜN KUVVETLERİ BİTTİ 5'İN KİNE GEÇİLİYOR____________________" );

        for(int k = 1 ; k <= input ; k*=5)
            System.out.println ("5'in kuvveti = "+k );

    }


}
