package JAVA101.Donguler;

import java.util.Scanner;

public class MukkemmelSayiBulanProgram {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number=0 ;
    int total = 0 ;
    System.out.println("Lütfen bir sayı giriniz :");
    number = sc.nextInt();
    for(int i = 1 ; i < number  ; i++) {
   if(number % i == 0) {
   total += i;
   }
   
}
    if(total == number) {
    System.out.println("Bu sayı mükkemmel sayıdır.");

    } else {
    System.out.println("Bu sayı mükkemmel sayı değildir.");
}

    }
}
