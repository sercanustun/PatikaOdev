package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen matematik notunuzu giriniz :");
		Double mathNote = klavye.nextDouble();
		
		System.out.println("Lütfen fizik notunuzu giriniz :");
		Double phyNote = klavye.nextDouble();
		
		System.out.println("Lütfen kimya notunuzu giriniz :");
		Double chemNote = klavye.nextDouble();
		
		System.out.println("Lütfen türkçe notunuzu giriniz :");
		Double turNote = klavye.nextDouble();
		
		System.out.println("Lütfen tarih notunuzu giriniz :");
		Double hisNote = klavye.nextDouble();
		
		System.out.println("Lütfen müzik notunuzu giriniz :");
		Double musicNote = klavye.nextDouble();
		
		Double avgNote = (mathNote + phyNote + chemNote + turNote + hisNote + musicNote) / 6;
		
		boolean isPass = avgNote >= 60;
		String str = isPass ? "TEBRİKLER GEÇTİNİZ" : "ÜZGÜNÜM KALDINIZ";
		
		System.out.println("ORTALAMANIZ = " + avgNote + " " + str);
		
	}
	
}
