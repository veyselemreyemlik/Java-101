import java.util.Scanner;

public class Main {

    static void desingMethodazalan(int sayi){
        for (int i = sayi ; i > 0 ;  i -= 5){
            System.out.print(i + " ");

            }
        }

    static void desingMethodartan(int sayi){
        for (int i = 0; i <= sayi ;  i += 5){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int num = scanner.nextInt();
        desingMethodazalan(num);
        desingMethodartan(num);

    }
}