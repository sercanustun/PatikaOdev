package JAVA101.Donguler;

import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen Küçük Sayıyı Giriniz");
        int num1 = sc.nextInt();

        System.out.println("Lütfen Büyük Sayıyı Giriniz");
        int num2 = sc.nextInt();


        int i = num1 -1;
        while(i<num1) {
            i--;
            if(num1%i == 0 && num2 %i == 0 ) {
             
                break;

            }
        }
        int ebob = i ;
        System.out.println("EBOB = " + ebob);

        int ekok = (num1*num2)/ebob ;

        System.out.println("EKOK = " + ekok);


    }
}
