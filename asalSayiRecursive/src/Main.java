import java.util.Scanner;

public class Main {
    public static boolean asalSayi(int number , int bolen){
        if(number < 2){
            //2 den kücük sayılar asal değildir.
            return false;
        }
        else if (number ==2) {
            //2 asal sayıdır.
            return true;
        }
        else if (number % bolen == 0){
            //Eğer sayı bölünürse asal değildir.
            return false;
        }
        else if (bolen * bolen > bolen){
            // Sayının karekokunden büyük sayılara bölünmezse asaldır.
            return true;
        }

        return asalSayi(number,bolen+1 );
        // Bolen artar fonks. tekrar çağrılır.


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
         int numb = input.nextInt();
        if (asalSayi(numb,2)){
            System.out.println(numb +" asal sayidir.");
        } else{
            System.out.println(numb + " asal bir sayı değildir.");
        }

    }
}