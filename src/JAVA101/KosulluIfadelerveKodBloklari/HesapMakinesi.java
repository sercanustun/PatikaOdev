package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
	
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz :");
		n1 = sc.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz :");
		n2 = sc.nextInt();
		
		System.out.println("Yapmak istediğiniz işlemi seçiniz :\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		int key = sc.nextInt();
		
		switch (key) {
			case 1:
				System.out.println("işleminizin sonucu = " + (n1 + n2));
				break;
			case 2:
				System.out.println("işleminizin sonucu = " + (n1 - n2));
				break;
			case 3:
				System.out.println("işleminizin sonucu = " + (n1 * n2));
				break;
			case 4:
				if (n2 != 0) {
					System.out.println("işleminizin sonucu = " + (n1 / n2));
					
				} else {
					System.out.println("Bir sayi 0 a bölünemez.");
					
				}
				
				break;
			default:
				System.out.println("Lütfen geçerli bir giriş yapınız.");
				break;
		}
		
	}
	
}
