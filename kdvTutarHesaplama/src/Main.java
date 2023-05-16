import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Para Değeri Giriniz : ");
        tutar = input.nextDouble();
        System.out.println("Kdvsiz Tutar : " + tutar);
        double kdvTutar = tutar * kdvOran ;
        System.out.println("Kdv Tutarı :" + kdvTutar);
        System.out.println("Kdv Oranı : " + kdvOran);

        double kdvliTutar = tutar + kdvTutar ;
        System.out.println("Kdvli tutar :" + kdvliTutar );
    }
}