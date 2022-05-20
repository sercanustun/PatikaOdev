package JAVA101.METOTLAR;

public class PalindromSayilar {

    static boolean isPalindrom(int number) {
        int temp = number, lastNumber, newNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            newNumber = (temp * 10) + lastNumber;
            temp /= 10;
        }

        if (temp == newNumber) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {


        System.out.println(isPalindrom(247));

    }

}
