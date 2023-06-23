import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  yas , mesafe , kulTip;

        double tutar ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz: " );
        mesafe = scanner.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        yas = scanner.nextInt();

        System.out.println("Kullanıcı Tipini Giriniz : (1 => Tek Yön , 2=> Çift Yön)");
        kulTip = scanner.nextInt();
        if (mesafe > 0) {
            if (kulTip == 1) {
                tutar = mesafe * 0.10;
                if (yas <= 12) {
                    System.out.println("Çocuk İndirimi Uygulandı.");
                    tutar = tutar / 2;
                    System.out.println("Tutar : " + tutar);
                } else if (yas > 12 && yas <= 24) {
                    System.out.println("Genç İndirimi Uygulandı.");
                    tutar = (tutar * 90 ) / 100 ;
                    System.out.println("Tutar :" + tutar);
                } else if (yas > 24 && yas < 65){
                    System.out.println("Standart Yolcu Ücreti Uygulandı.");
                    System.out.println("Tutar :" + tutar );
                } else if (yas >= 65 ) {
                    System.out.println("Yaşlı Yolcu İndirimi Uygulandı.");
                    tutar = (tutar * 70) / 100 ;
                    System.out.println("Tutar : " + tutar);
                }
            }


            if (kulTip == 2) {
                tutar = mesafe * 0.10;
                if (yas <= 12) {
                    System.out.println("Çocuk İndirimi Uygulandı.");
                    tutar = tutar * 0.5;
                    System.out.println("Tutar : " + tutar);

                } else if (yas > 12 && yas <= 24) {

                    System.out.println("Genç İndirimi Uygulandı.");
                    tutar = (tutar * 90 ) / 100 ;
                    System.out.println("Tutar :" + tutar * 2);
                } else if (yas > 24 && yas < 65){

                    System.out.println("Standart Yolcu Ücreti Uygulandı.");
                    System.out.println("Tutar :" + tutar * 2 );
                } else if (yas >= 65 ) {

                    System.out.println("Yaşlı Yolcu İndirimi Uygulandı.");
                    tutar = (tutar * 70) / 100 ;
                    System.out.println("Tutar : " + tutar * 2);
                }
            }
            else{
                System.out.println("Hatalı Bir Değer Girdiniz !");
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}