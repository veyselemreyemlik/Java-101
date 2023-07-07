import java.util.Scanner;

public class Main {
    static void sum(){
        // Sayıları Toplayan Fonks.
        Scanner input = new Scanner(System.in);
        int num1 , num2 , result;
        System.out.print("1. Sayıyı Giriniz : ");
         num1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        num2 = input.nextInt();
        result = num1 + num2 ;
        System.out.println("Sayıların Toplamı :" + result);

    } // Toplama
    static void divide(){
        Scanner input = new Scanner(System.in);
        int num1 , num2 ;
        double result  ;
        System.out.print("Bölünecek Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("Bölen Sayıyı Giriniz : ");
        num2 = input.nextInt();
        result = num1 / num2;
        if (num1 > num2){
            System.out.println("Sayıların Bölümü :" + result);
        }else
            System.out.println("Hata ! - Bölen Sayı Bölünecek Sayıdan Büyük Olamaz.");
    } // Bölme
    static void extrac(){
        // Sayıları ÇıkaranFonks.
        Scanner input = new Scanner(System.in);
        int num1 , num2 , result=0;
        System.out.print("1. Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        num2 = input.nextInt();

        // Büyük sayı hangisi ise ondan küçük sayı çıkarılacak.
        if (num1 >= num2){
            result = num1 - num2 ;
            System.out.println(num1 + " - "+ num2 + " = " +result);

        }
        else if(num2 >= num1) {
            result = num2 - num1 ;
            System.out.println(num2 + " - "+ num1 + " = " +result);
        }

    } // Çıkarma
    static void impact(){
        // Sayıları ÇıkaranFonks.
        Scanner input = new Scanner(System.in);
        int num1 , num2 , result=0;
        System.out.print("1. Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        num2 = input.nextInt();
        result = num1 * num2 ;
        System.out.println("Sayıların Çarpımı :" + result);

    } // Çarpma
    static void power(){
        //Üslü sayı hesaplama
        Scanner input = new Scanner(System.in);
        int pwr , base , result=1;

        System.out.print("Taban değeri giriniz :");
         base = input.nextInt();
        System.out.print("Üs değeri giriniz :");
         pwr = input.nextInt();

         if(pwr > 0){
             for (int i = 1 ; i <= pwr ; i++){
                 result *= base;
             }
             System.out.println(base + " üzeri " + pwr + " = " + result );
         }else{
             System.out.println( pwr +" sayısı negatif bir sayıdır.");
         }

    } // Üs alma
    static void fact (){

        // Sayının faktöriyelini hesaplama
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayı :");
        int facknum ;
        int faktoriyel = 1 ;
         facknum = input.nextInt();

        for (int i= 1 ; i <= facknum ; i++){
            faktoriyel = faktoriyel * i ;
        }
        System.out.println(facknum + " sayısının faktoriyeli => " + faktoriyel);

    } // Fakt alma
    static void mod(){
        // Sayının Modunu alma.
     Scanner input = new Scanner(System.in);
      int number , mod , result = 1;
        System.out.println("Bir sayı giriniz :");
         number = input.nextInt();
        System.out.println("Mod değerini giriniz :");
         mod = input.nextInt();
         if (number > mod && number != 0 && mod > 0){
             result = number % mod ;
             System.out.println(number + " sayısının " + mod + " sayısına göre modu  => " + result);
         } else if (mod == 0) {
             System.out.println("Mod değerini pozitif bir sayı giriniz !");
         }else if (number < 0){
             System.out.println("Sayıyı 0 dan büyük pozitif bir sayı giriniz !");
         } else if (mod > number) {
             System.out.println("Sayıyı Mod değerinden yüksek bir değer giriniz !");
         }

    } // Mod alma
    static void areaCalc(){
        // Dikdörtgenin alan ve çevre hesaplama
        Scanner input = new Scanner(System.in);
        int kısaKenar , uzunKenar ;
        int alan , çevre ;
        System.out.println("** Girilen Değerlerin Dikdörtgen Şekline Uygun Olmasına Dikkat Edin. **");

        System.out.print("Kısa Kenarı Girin :");
         uzunKenar = input.nextInt();
        System.out.print("Uzun Kenarı Girin :");
         kısaKenar = input.nextInt();

        if (uzunKenar > kısaKenar){
            alan = uzunKenar * kısaKenar ;
            System.out.println("Dikdörtgen Alan :" + alan);
            çevre = (uzunKenar + kısaKenar) * 2 ;
            System.out.println("Dikdörtgen Çevre :" + çevre);
        } else if (uzunKenar == kısaKenar) {
            System.out.println("Girdiğin değer Kare şeklini belirtir.");
        } else if (kısaKenar > uzunKenar) {
            System.out.println("Bu bir Dikdörtgen şekli değildir.");
        }

    } // alan hesap


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection ;

        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz :");
        System.out.println("1- Toplama İşlemi \n" +
                "2- Bölme İşlemi\n" +
                "3- Çıkarma İşlemi\n" +
                "4- Çarpma işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.print(" ==> ");
            selection = input.nextInt();
        switch (selection){
            case 1 :
                System.out.println("***");
                sum();
                break;
            case 2 :
                System.out.println("***");
                divide();
                break;
            case 3 :
                System.out.println("***");
                extrac();
                break;
            case 4 :
                System.out.println("***");
                impact();
                break;
            case 5 :
                System.out.println("***");
                power();
                break;
            case 6 :
                System.out.println("***");
                fact();
                break;
            case 7 :
                System.out.println("***");
                mod();
                break;
            case 8 :
                System.out.println("***");
                areaCalc();
                break;

        }
    }
}