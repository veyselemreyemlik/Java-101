import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,i=0,maxNum=0,minNum=0;
        boolean firstNum=true;
        // Kaç adet sayı girelecek burda belirleniyor.
        System.out.print("How many numbers will you enter:");
        number = input.nextInt();
        while (i<number){
            // i değişkeni ile girilen sayı kontrolü
            i++;
            System.out.print("Enter the number: ");
            int sayi=input.nextInt();

            if(firstNum){
                //
                maxNum=sayi;
                minNum=sayi;
                firstNum=false;
            }else{

                if(sayi>maxNum){
                    minNum=sayi;
                }if (sayi<minNum){
                    minNum=sayi;
                }
            }
        }
        // Ekrana yazdırma.
        System.out.println("Largest:"+maxNum);
        System.out.print("Smallest:"+minNum);
    }
}