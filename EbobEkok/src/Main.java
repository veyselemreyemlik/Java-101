import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberSmall, numberLarge ;
        int ebob = 1 , ekok = 1 , i = 1;;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the small number:");
        numberSmall = scanner.nextInt();
        System.out.print("Enter the large number : ");
        numberLarge = scanner.nextInt();

        while (i <= numberSmall){
            if (numberSmall % i == 0 && numberLarge % i == 0){
                ebob = i ;
            }
            i++;
        }
        System.out.println("Ebob of numbers :" + ebob );

        // ****EKOK****

        while (i <= numberSmall * numberLarge) {
            if (i % numberSmall == 0 && i % numberLarge == 0){
                ekok = i ;
                break;
            }
            i++;
        }
        System.out.println("Ekok of numbers :" + ekok);


    }
}