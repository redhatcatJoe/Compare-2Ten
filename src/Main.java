import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Comparator comparator = new Comparator ();
        Scanner s = new Scanner (System.in);
        System.out.println ("enter a  and b" );

        System.out.println (comparator.compare (s.nextInt (), s.nextInt ()) );
    }
}
