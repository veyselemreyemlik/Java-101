import java.util.Scanner;
public class Main {
    static int pow(int us, int taban) {
        // üs alacak fonksiyon
        if(taban==0) {
            return 1;
        }
        else {
            return us * pow(us,taban-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x =true;

        // Burda x sürekli olarak sayıyı hesaplar.
        while (x) {
            System.out.print("Taban Değeri:");
            int a = input.nextInt();
            System.out.print("Üs Değeri:");
            int b = input.nextInt();
            System.out.println("Cevap: " + pow(a, b));

        }
    }
}