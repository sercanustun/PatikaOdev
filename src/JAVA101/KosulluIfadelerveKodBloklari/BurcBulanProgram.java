package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class BurcBulanProgram    {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen doğduğunuz gün giriniz");
        int day = sc.nextInt();

        System.out.println("Lütfen doğduğunuz ayı rakam olarak giriniz");
        int month = sc.nextInt();



        if ((month == 3 && day <= 31 && day >= 21) || ( month == 4 && day <=20 && day>=1)){

            System.out.println("Burcunuz : KOÇ");

        } 

        if ((month == 4 && day <= 31 && day >= 21) || ( month == 5 && day <=21 && day>=1)){

            System.out.println("Burcunuz : BOĞA");

        } 

        if ((month == 5 && day <= 31 && day >= 22) || ( month == 6 && day <=22 && day>=1)){

            System.out.println("Burcunuz : İKİZLER");

        } 

        if ((month == 6 && day <= 31 && day >= 23) || ( month == 7 && day <=22 && day>=1)){

            System.out.println("Burcunuz : YENGEÇ");

        } 

        if ((month == 7 && day <= 31 && day >= 23) || ( month == 8 && day <=22 && day>=1)){

            System.out.println("Burcunuz : ASLAN");

        } 

        if ((month == 8 && day <= 31 && day >= 23) || ( month == 9 && day <=22 && day>=1)){

            System.out.println("Burcunuz : BAŞAK");

        } 

        if ((month == 9 && day <= 31 && day >= 23) || ( month == 10 && day <=22 && day>=1)){

            System.out.println("Burcunuz : TERAZI");

        } 

        if ((month == 10 && day <= 31 && day >= 23) || ( month == 11 && day <=21 && day>=1)){

            System.out.println("Burcunuz : AKREP");

        } 

        if ((month == 11 && day <= 31 && day >= 22) || ( month == 12 && day <=21 && day>=1)){

            System.out.println("Burcunuz : YAY");

        } 

        if ((month == 12 && day <= 31 && day >= 22) || ( month == 1 && day <=21 && day>=1)){

            System.out.println("Burcunuz : OĞLAK");

        } 

        if ((month == 1 && day <= 31 && day >= 22) || ( month == 2 && day <=19 && day>=1)){

            System.out.println("Burcunuz : KOVA");

        } 

        if ((month == 2 && day <= 31 && day >= 20) || ( month == 3 && day <=20 && day>=1)){

            System.out.println("Burcunuz : BALIK");

        } 





















    }
}
