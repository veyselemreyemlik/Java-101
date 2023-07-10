import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Mike Tyson" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Muhammed Ali" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}