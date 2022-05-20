package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireninAlaniniHesaplayanProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen alani hesaplanacak dairenin yarıçapını cm cinsinden veriniz :");
		Double r = sc.nextDouble();
		System.out.println("Lütfen alani hesaplanacak dairenin 𝛼 açısını veriniz (Tamami için 360 / Yarisi için 180)");
		Double angle = sc.nextDouble();
		
		Double area = ((3.14 * (r * r) * angle) / 360);
		System.out.println("Yarıçapı ve açısı verilen dairenin alanı : " + area + "cm^3 dür");
	}
}
