package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaksimetreProgrami {
	public static void main(String[] args) {
		Double costPerKm = 2.20;
		Double startingPrice = 10.0;
		Double minPrice = 20.0;
		Double km;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen gidilecek yolu km cinsinden veriniz :");
		km = sc.nextDouble();
		Double price = startingPrice + (costPerKm * km);
		if (price <= 20) {
			System.out.println("Ücretiniz = " + minPrice + "TL'dir");
		} else {
			System.out.println("Ücretiniz = " + price + "TL'dir");
		}
	}
}
