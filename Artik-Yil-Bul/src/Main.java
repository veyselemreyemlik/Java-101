import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hesaplanacak Yılı Girin :");
        year = scanner.nextInt();
        if (year % 4 == 0){
            System.out.println(year + " bir artık yıldır !");
        } else System.out.println(year + " bir artık yıl değildir !");

    }
}