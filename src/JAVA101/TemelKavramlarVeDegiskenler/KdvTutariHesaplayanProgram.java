package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen ürünün TL cinsinden KDV siz fiyatını giriniz : ");
		Double value = klavye.nextDouble();
		Double taxRate;
		
		if (value <= 1000) {
			taxRate = 18.0;
			
		} else {
			taxRate = 8.0;
		}
		
		Double taxedValue = value + (value * taxRate / 100);
		Double taxValue = taxedValue - value;
		
		System.out.println("KDV siz ürün fiyatı = " + value + "TL");
		System.out.println("KDV Oranı = %" + taxRate);
		System.out.println("KDV Tutari = " + taxValue + "TL");
		System.out.println("KDV li Ürün Tutarı = " + taxedValue + "TL");
		
	}
	
}
