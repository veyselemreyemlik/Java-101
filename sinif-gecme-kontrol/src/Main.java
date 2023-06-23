import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math , turk , kimya , fizik , muzik ;
        Scanner ınput = new Scanner(System.in);

        System.out.println("Ders Notlarını Giriniz !");

        System.out.println("Matematik Ders Notunu Giriniz :");
        math = ınput.nextInt();

        System.out.println("Türkçe Ders Notunu Giriniz :");
        turk = ınput.nextInt();

        System.out.println("Kimya Ders Notunu Giriniz :");
        kimya= ınput.nextInt();

        System.out.println("Fizik Ders Notunu Giriniz :");
        fizik = ınput.nextInt();

        System.out.println("Kimya Ders Notunu Giriniz :");
        muzik = ınput.nextInt();

        double avarage = (math + turk + kimya + fizik + muzik) / 5 ;
        System.out.println("Öğrenci Not Ortamalaması : " + avarage);

        if (avarage >= 0 || avarage <= 100){

            if (avarage < 40){
                System.out.println("Öğrenci Sınfta Kaldı !");
            }else if (avarage > 40 && avarage <70){
                System.out.println("Öğrenci Dersi Geçti Ama Belge Almaya Hak Kazanamadı !");
            }else if (avarage >= 70 && avarage < 85){
                System.out.println("Öğrenci Dersi Geçti ve Teşekkür Belgesi Aldı !");
            }else if (avarage >= 85){
                System.out.println("Öğrenci Dersi Geçti ve Takdir Belgesi Aldı !");
            }

        }else System.out.println("Not Ortlaması Hesaplanmadı !");

    }
}