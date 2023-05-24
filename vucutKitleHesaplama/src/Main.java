import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy ;
        int kilo;

        double indeks ;

        Scanner boyu = new Scanner(System.in);
        Scanner kilosu = new Scanner(System.in);
        boy = boyu.nextDouble();
        kilo = kilosu.nextInt();

        indeks = (kilo / boy) * boy ;
        System.out.println("Vucut Kitle İndeksi : " + indeks);
    }
}