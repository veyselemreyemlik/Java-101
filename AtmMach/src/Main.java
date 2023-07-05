import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right >= 3) {
            System.out.print("Kullanıcı Adını Giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolayı Giriniz : ");
            password = input.nextLine();

            if (userName.equals("veyselemre") && password.equals("password")) {
                System.out.println("Merhaba, Kodluyoruz Bankaya Hoş Geldiniz!");

                do {
                    System.out.println("Yapacağınız İşlemler İçin İşlem Kodunu Giriniz:");
                    System.out.println("1 - Para Çekme\n2 - Para Yatırma\n3 - Bakiye Sorgulama\n4 - Çıkış Yap");
                    System.out.print("İşlem Kodunu Giriniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Çekmek İstediğiniz Tutar: ");
                            int price = input.nextInt();
                            if (balance >= price) {
                                balance = balance - price;
                                System.out.println("Kalan Bakiye: " + balance);
                            } else {
                                System.out.println("Çekmek istediğiniz tutar bakiyenizden fazla.");
                            }
                            break;

                        case 2:
                            System.out.println("Yatırmak İstediğiniz Tutar: ");
                            price = input.nextInt();
                            balance = balance + price;
                            System.out.println("Toplam bakiye: " + balance);
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }

                } while (select != 4);

                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                System.out.println("Kullanıcı Adı veya Şifre Yanlış.");
                System.out.println("**** Tekrar Deneyiniz ****");
            }
        }
    }
}
