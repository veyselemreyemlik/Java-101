import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ones , the , hun  ;
        int number ;

        System.out.println("Enter a number : ");
        number = scanner.nextInt();

        // Sayıyı bu işlemleri yaptırarak basamak sayılarını buluyoruz.
        hun = number / 100 ;
        the = (number / 10) % 10;
        ones = number % 10 ;

        System.out.println("Yüzler Basamağı:" + hun);
        System.out.println("Onlar Basamağı :" + the);
        System.out.println("Birler Basamağı :" + ones);
        int sum = hun + the + ones ;
        System.out.println("Toplamları :" + sum );
    }
}