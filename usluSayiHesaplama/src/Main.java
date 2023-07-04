import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number , expo = 0 ;
        Scanner scanerr = new Scanner(System.in);

        System.out.print("Enter a number : ");

        number = scanerr.nextInt();

        for (int i = 1 ; i <= number ; i++){
            expo = number * number ;
        }
        System.out.println("Exponential number : " + expo);
    }
}