package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKitleIndexiHesaplayanProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu m cinsinden veriniz (örn 1.78 ondalık sayilar için '.' kullanınız)");
		Double height = sc.nextDouble();
		System.out.println("Lütfen kilonuzu kg cinsinden veriniz (örn 65.8 ondalık sayilar için '.' kullanınız)");
		Double weight = sc.nextDouble();
		Double index = (weight / (height * height));
		
		System.out.println("Vücut kitle endeksiniz = " + index + "dir");
		
	}
	
}
