package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class SinifiGecmeDurumu {
	
	public static void main(String[] args) {
		
		int total = 0, count = 0, matematik, fizik, türkçe, kimya, müzik;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen Matematik notunuzu giriniz ");
		matematik = sc.nextInt();
		if (matematik <= 100 && matematik >= 0) {
			total += matematik;
			count++;
		}
		
		System.out.println("Lütfen Fizik notunuzu giriniz ");
		fizik = sc.nextInt();
		if (fizik <= 100 && fizik >= 0) {
			total += fizik;
			count++;
		}
		
		System.out.println("Lütfen Türkçe notunuzu giriniz ");
		türkçe = sc.nextInt();
		if (türkçe <= 100 && türkçe >= 0) {
			total += türkçe;
			count++;
		}
		
		System.out.println("Lütfen Kimya notunuzu giriniz ");
		kimya = sc.nextInt();
		if (kimya <= 100 && kimya >= 0) {
			total += kimya;
			count++;
		}
		
		System.out.println("Lütfen Müzik notunuzu giriniz ");
		müzik = sc.nextInt();
		if (müzik <= 100 && müzik >= 0) {
			total += müzik;
			count++;
		}
		
		if (total / count >= 55) {
			System.out.println("Tebrikler sınıfı geçtiniz ortalamanız = " + total / count);
		} else {
			System.out.println("Üzgünüm sınıfta kaldınız ortalamanız = " + total / count);
		}
		
	}
	
}
