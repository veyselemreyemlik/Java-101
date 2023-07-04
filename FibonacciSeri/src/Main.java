import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number , result =0;
        System.out.print("Seri Sınır Sayısı :");
        number = scanner.nextInt();
        System.out.println(number +" " + "Elemanlı Fibonacci Serisi :");

        int n1 = 0 ;
        int n2 = 1;

        for (int i = 1 ; i <= number ; i++){
            System.out.println(n1 + " ");
            result = n1 + n2 ;
            n1 = n2 ;
            n2 = result ;
        }

    }
}