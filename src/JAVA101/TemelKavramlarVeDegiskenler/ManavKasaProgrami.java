package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
	
	public static void main(String[] args) {
		Double armut = 2.14;
		Double elma = 3.67;
		Double domates = 1.11;
		Double muz = 0.95;
		Double patlican = 5.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Armuttan kaç kilo almak istersiniz ? (kg fiyati = 2.14 TL) ");
		Double kgArmut = sc.nextDouble();
		System.out.println("Elmadan kaç kilo almak istersiniz = (kg fiyati = 3.67 TL)");
		Double kgElma = sc.nextDouble();
		System.out.println("Domatesten kaç kilo almak istersiniz = (kg fiyati = 1.11 TL");
		Double kgDomates = sc.nextDouble();
		System.out.println("Muzdan kaç kilo almak istersiniz = (kg fiyati = 0.95 TL");
		Double kgMuz = sc.nextDouble();
		System.out.println("Patlicandan kaç kilo almak itersiniz = (kg fiyati 5.0 TL");
		Double kgPatlican = sc.nextDouble();
		
		Double cost = (armut * kgArmut) + (elma * kgElma) + (domates * kgDomates) + (muz * kgMuz)
				+ (patlican * kgPatlican);
		System.out.println("Ödemeniz gereken toplam tutar = " + cost + "TL dir");
		
	}
	
}
