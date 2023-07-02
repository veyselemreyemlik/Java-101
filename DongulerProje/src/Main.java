import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while (number % 2 == 0) {
            if (number % 4 == 0) {
                sum += number;
            } else {
                System.out.println("The number is even but not divisible by 4!");
            }

            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
