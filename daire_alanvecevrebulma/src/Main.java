import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r ;
        int aci ;
        double pi = 3.14 ;
        Scanner inp = new Scanner(System.in);
        Scanner acinp = new Scanner(System.in);
        r = inp.nextInt();
        aci = acinp.nextInt();

        double alan = (pi * (r*r) * aci) / 360 ;

        System.out.println("Daire Diliminin Alanı :" + alan);
    }
}