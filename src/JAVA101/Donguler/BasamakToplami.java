package JAVA101.Donguler;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");
        int num = input.nextInt();

        int total = 0;

        while(true){
            if(num != 0){
                total += num%10;
                num = num - num%10;
                num = num /10;
            }
            else{
                break;
            }
        }
        System.out.println("Sayının basamaklarının toplamı : " +  total);
    }
}