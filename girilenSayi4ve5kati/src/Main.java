import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int number , result= 0 ;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
         number = scanner.nextInt();
         //result = scanner.nextInt();
       for (int i = 1 ; i < number ; i++){
           if (i % 4 == 0 && i % 5 == 0){
               System.out.println("Girilen Sayı  :" + i);
           }
       }

    }
}