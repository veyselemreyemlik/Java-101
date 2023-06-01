import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 , num2 ;
        int result ;
        Scanner number = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz :");
        num1 = number.nextDouble();
        System.out.println("2. Sayıyı Giriniz :");
        num2 = number.nextDouble();

        System.out.println("Yapılacak İşlemi Seçiniz : /n 1- Toplama /n 2- Cikarma /n 3- Carpma /n  4- Bolme");

        result = number.nextInt();
        switch (result){
            case 1:
                System.out.println("Sonuç : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Sonuç : " + (num1 / num2));
                break;

        }


    }
}