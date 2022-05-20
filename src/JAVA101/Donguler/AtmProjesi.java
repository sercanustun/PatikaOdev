package JAVA101.Donguler;

import java.util.Scanner;

public class AtmProjesi {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int balance = 1500;
        int amount;
        int key;


        for (int attempt = 3; attempt >= 0; attempt--) {
            System.out.println ( " Lütfen kullanıcı adınızı giriniz :" );
            String id = sc.next ( );
            System.out.println ( " Lütfen şifrenizi giriniz :" );
            String pw = sc.next ( );

            if ( id.equals ( "sercan" ) && pw.equals ( "123" ) ) {
                do {

                    System.out.println ( "Sisteme hoşgeldiniz lütfen yapmak istediğiniz işlemi tuşlayınız : " );
                    System.out.println ( "1-PARA YATIRMA\n2-PARA ÇEKME\n3-BAKİYE SORGULA\n4-ÇIKIŞ YAP" );

                    key = sc.nextInt ( );


                    switch ( key ) {
                        case 1 -> {
                            System.out.println ( "Lütfen yatırmak istediğiniz tutarı tuşlayınız :" );
                            amount = sc.nextInt ( );
                            balance += amount;
                            System.out.println ( "İşleminiz gerçekleştirilmiştir yeni bakiyeniz : " + balance );
                        }
                        case 2 -> {
                            System.out.println ( "Lütfen çekmek istediğiniz tutarı tuşlayınız :" );
                            amount = sc.nextInt ( );
                            if ( amount <= balance ) {
                                balance -= amount;
                                System.out.println ( "İşleminiz gerçekleştirildi yeni bakiyeniz : " + balance );
                            } else
                                System.out.println ( "Para çekme işleminizin tutarı bakiyenizden fazla olamaz bakiyeniz : " + balance );
                        }
                        case 3 -> System.out.println ( "Bakiyeniz : " + balance );
                        case 4 -> System.out.println ( "Görüşürüz ..." );

                    }

                } while (key!=4);


            } else {
                if ( attempt > 0 ) {
                    System.out.println ( "Kullanıcı adı veya şifre hatalı kalan deneme hakkınız :" + attempt );
                } else {
                    System.out.println ( "3den fazla yanlış deneme yaptınız sistemden çıkış yapılıyor ..." );

                }
            }

        }

    }
}
