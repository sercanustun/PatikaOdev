package JAVA101.KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen id nizi giriniz ");
		final String id = sc.nextLine();
		System.out.println("Lütfen şifrenizi giriniz ");
		final String pass = sc.nextLine();
		
		if (id.equals("patika") && pass.equals("patika123")) {
			System.out.println("Hoşgeldiniz");
		} else if (id.equals("patika")) {
			
			System.out.println("Şifreniz uyuşmuyor uyuşmuyor yenilemek için 1 e basınız çıkmak için 2 ye basınız .");
			
			final int value = sc.nextInt();
			switch (value) {
				
				case 1:
					System.out.println("Lütfen şifrenizi giriniz :");
					
					final String pass1 = sc.next();
					
					System.out.println("Lütfen şifrenizi tekrar giriniz :");
					
					final String pass2 = sc.next();
					
					if (pass1.equals(pass2)) {
						System.out.println("Şifreniz güncellenmiştir.");
					} else {
						System.out.println("Lütfen şifrelerinizi aynı giriniz.");
					}
					;
					break;
				
				case 2:
					System.out.println("Güle Güle ");
					break;
				
				default:
					System.out.println("Lütfen geçerli bir tuşlama yapınız.");
					break;
			}
			
		} else {
			System.out.println("Kullanıcı bulunamadı.");
		}
		sc.close();
	}
	
}
