package JAVA101.Donguler;

import java.util.Scanner;

public class YildizlarIleUcgenYapma {

//          *
//         ***
//        *****
//       *******
//      *********
//     ***********


    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Üçgeniniz kaç satırdan oluşsun ? = " );
        int line = sc.nextInt ();

        for (int i = 1 ; i<=line ; i++){

            for (int k = 1 ; i<= line-k ; k++){
                System.out.print (" " );
            }

            for (int j = 1 ; j<= (2*i)-1 ; j++){
                System.out.print ("*" );

            }

            System.out.println ( );



        }





    }

}
