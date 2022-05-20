package JAVA101.TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Üçgenin 1. Kenar Uzunluğunu Yazınız :");
		Double firstSide = sc.nextDouble();
		System.out.println("Lütfen Üçgenin 2. Kenar Uzunluğunu Yazınız :");
		Double secondSide = sc.nextDouble();
		System.out.println("Lütfen Üçgenin 3. Kenar Uzunluğunu Yazınız :");
		Double thirdSide = sc.nextDouble();
		
		Double perimeter = firstSide + secondSide + thirdSide;
		Double u = perimeter / 2;
		Double area2 = u * ((u - firstSide) * (u - secondSide) * (u - thirdSide));
		Double area = Math.pow(area2, 0.5);
		
		System.out.println("Üçgenin alanı = " + area);
		
	}
	
}
