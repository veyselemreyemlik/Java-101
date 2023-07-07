import java.util.Scanner;

public class Main {
    public static boolean isPalindromNum(int number ){
        Scanner input = new Scanner(System.in);
        int temp = number , lastNum , reversNum;
        reversNum = 0 ;
        while(temp != 0){
            lastNum = temp % 10 ;
            reversNum = (reversNum * 10) + lastNum;
            // örnek 247 sayısının 742 olması için bu işle yapıldı.
            temp /= 10;
        }
        if(number == reversNum){
            return true ;
        }else {
            return  false;
        }
    }
    public static void main(String[] args) {
        isPalindromNum(9889);
    }
}