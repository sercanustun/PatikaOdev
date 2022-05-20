package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
	// Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
	// Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
	// Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
	// Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
	public static void main(String[] args) {
		int heat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen hava sıcaklıgını giriniz : ");
		heat = sc.nextInt();
		if (heat <= 5) {
			System.out.println("Kayak Yapabilirsiniz.");
		} else if (heat >= 5 && heat <= 15) {
			System.out.println("Sinamaya gidebilirsiniz.");
			
		} else if (heat > 15 && heat < 25) {
			System.out.println("Piknik Yapabilirsiniz");
		} else {
			System.out.println("Yüzme yapabilirsiniz");
		}
		
	}
	
}
