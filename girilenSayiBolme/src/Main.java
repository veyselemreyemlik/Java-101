import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number , adet ;
        Scanner num = new Scanner(System.in);
        // Toplam kaç adet sayı girilecek onu belirliyoruz.
        System.out.print("Kaç Adet Sayı Girmek İstiyorsunuz :");
        adet = num.nextInt();

        for (int i = 0; i < adet-1 ; i++){
            System.out.print("Sayı Giriniz = ");

            number = num.nextInt();
            // Sayı 3 ve 4 e bölünürse IF kod blogu çalışır , bölünmez ise else çalışır.
            if ( number % 12 == 0){
                System.out.println("Sayı hem 3 e hem de 4 e bölünebilir.");
            } else {
                System.out.println("Sayı 3 e ve 4 e bölünemez.");
            }
        }

    }
}