import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kenar1 , kenar2 , kenar3 ;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Ücgenin Kenarlarını Gir :");

        kenar1 = girdi.nextInt();
        kenar2 = girdi.nextInt();
        kenar3 = girdi.nextInt();

        double u = (kenar1 + kenar2 + kenar3) / 2 ;
        double cevre = 2 * u ;
        System.out.println("Üçgenin Çevresi : " + cevre);

        double alan = Math.sqrt(u * (u - kenar1) * (u-kenar2) * (u - kenar3)) ;

        System.out.println("Üçgenin alanı: " + alan);

    }
}