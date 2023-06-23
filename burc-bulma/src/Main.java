import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun , ay ;
        Scanner takvim = new Scanner(System.in);

        System.out.println("Dogdunuz Gunu Giriniz :");
         gun = takvim.nextInt();
        System.out.println("Doğdunuz Ayı Giriniz :");
         ay = takvim.nextInt();

         if (ay == 1){
             if (gun <= 21){
                 System.out.println("Oğlak Burcusunuz.");
             } else if (gun > 21) {
                 System.out.println("Kova Burcusunuz.");
             }
         }
         if (ay == 2){
             if(gun <= 19){
                 System.out.println("Kova Burcusunuz.");
             } else if (gun > 19) {
                 System.out.println("Balık Burcusunuz.");
             }
         }
         if (ay == 3){
             if (gun <= 20 ){
                 System.out.println("Balık Burcusunuz.");
             }else if (gun > 20){
                 System.out.println("Koç Burcusunuz.");
             }
         }
         if (ay == 4){
             if (gun <= 21 ){
                 System.out.println("Koç Burcusunuz.");
             } else if (gun > 21) {
                 System.out.println("Boğa Borcusunuz.");
             }
         }
         if (ay == 5){
             if (gun <= 21){
                 System.out.println("Boğa Burcusunuz.");
             } else if (gun > 21) {
                 System.out.println("İkizler Burcusunuz.");
             }
         }
         if (ay == 6){
             if(gun <= 22){
                 System.out.println("İkizler Burcusunuz.");
             } else if (gun > 22) {
                 System.out.println("Yengeç Burcusunuz.");
             }

         }
         if (ay == 7){
             if (gun <= 22 ){
                 System.out.println("Yengeç Burcusunuz.");
             } else if (gun > 22) {
                 System.out.println("Aslan Burcusunuz.");
             }
         }
        if (ay == 8){
            if (gun <= 22 ){
                System.out.println("Aslan Burcusunuz.");
            } else if (gun > 22) {
                System.out.println("Başak Burcusunuz.");
            }
        }
        if (ay == 9){
            if (gun <= 23 ){
                System.out.println("Başak Burcusunuz.");
            } else if (gun > 23) {
                System.out.println("Terazi Burcusunuz.");
            }
        }
        if (ay == 10){
            if (gun <= 22 ){
                System.out.println("Terazi Burcusunuz.");
            } else if (gun > 22) {
                System.out.println("Akrep Burcusunuz.");
            }
        } if (ay == 11){
            if (gun <= 21 ){
                System.out.println("Akrep Burcusunuz.");
            } else if (gun > 21) {
                System.out.println("Yay Burcusunuz.");
            }
        }
        if (ay == 12){
            if (gun <= 21 ){
                System.out.println("Yay Burcusunuz.");
            } else if (gun > 21) {
                System.out.println("Oğlak Burcusunuz.");
            }
        }



    }
}