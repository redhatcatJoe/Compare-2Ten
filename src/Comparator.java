import javax.swing.table.TableStringConverter;
import java.util.Scanner;

public class Comparator {


    String compare(String a, String b){
        String r ="nothing";
        int a1 = Integer.parseInt (a) - 10;
        int b1= Integer.parseInt (b) - 10;
        a1 = abc (a1);        //positive numberrr
        b1 = abc (b1);       //
        if (a1 >b1)
            r = "b close to 10";
        if (a1==b1) {

            r = "a equal b";
        }
        else r = "a close to 10";

        return r;




    }

    int  abc(int i){       //method positive numbers
        if (i<0) {
            return -i;
        }
        else
            return i;
    }
}
