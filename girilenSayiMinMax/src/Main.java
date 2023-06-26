import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Kaç tane sayı gireceksiniz? ");
                int count = scanner.nextInt();

                int[] numbers = new int[count];

                System.out.println(count + " adet sayıyı girin:");

                int i = 0;
                while (i < count) {
                    numbers[i] = scanner.nextInt();
                    i++;
                }

                int min = numbers[0];
                int max = numbers[0];
                i = 1;

                while (i < count) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }

                    if (numbers[i] > max) {
                        max = numbers[i];
                    }

                    i++;
                }

                System.out.println("Minimum sayı: " + min);
                System.out.println("Maksimum sayı: " + max);
            }
        }

