import javax.swing.table.TableStringConverter;
import java.util.Scanner;

public class Comparator {


    String compare(int a, int b){
        String r ="nothing";
      int  a1=abc(10-a);
       int b1= abc( 10-b);
               //   2              9   1
        if( a1 > b1){
            r = b+" close to 10";
        }
        else  if (a1==b1){
            r= "a equals b";
        }


        else r = a+" close to 10";

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
