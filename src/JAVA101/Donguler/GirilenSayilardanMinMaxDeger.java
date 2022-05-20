package JAVA101.Donguler;

import java.util.Scanner;

public class GirilenSayilardanMinMaxDeger {
    public static void main(String[] args) {
        int min=0,max=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen kaç sayı gireceğinizi seçiniz ");
        int numOfNums = sc.nextInt();

        for(int i=1 ; i<=numOfNums ; i++ ) {
        System.out.println("Lütfen sayı giriniz .");
        int number = sc.nextInt();
        if(min == 0) {
        min = number ;
        }
        if(number < min) {
        min = number;
        }
        if(number > max ){
        max = number ;
        }
        }
        System.out.println("Min number : " + min + " Max number : " + max);


        
    }
}
