
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int a , b, c ;
        Scanner siralama = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz : ");
            a = siralama.nextInt();
        System.out.println("2. Sayıyı Giriniz :");
            b = siralama.nextInt();
        System.out.println("3. Sayıyı Giriniz :");
            c = siralama.nextInt();

        if ( (a < b) && (a < c) ){
            if (b < c){
                System.out.println(" a < b < c");
            } else if ( c < b){
                System.out.println(" a < c < b");
            }
        } else if ( (b < c) && (b < a)) {

            if (c < a){
                System.out.println(" b < c < a");
            } else if (a < c) {
                System.out.println("b < a < c");
            }
        } else if ( (c < a) && (c < b)) {
            if (a < b){
                System.out.println(" c < a < b");
            } else if (b < a) {
                System.out.println(" c < b < a");
            }
        }
    }
}