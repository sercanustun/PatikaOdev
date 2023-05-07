package JAVA101.DIZILER;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaEnYakinKucukVeBuyuk {
    public static void main(String[] args) {

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz :");
        int input = sc.nextInt();
        int small = input;
        int big = input;

        Arrays.sort(arr);

        for (int i : arr) {
            if (i > big) {
                big = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < small) {
                small = arr[i];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı :" + small);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + big);


    }
}
