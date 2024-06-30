
import java.util.Scanner;

public class continue_break {

    public static void main(String [] args){
        //continue & break concept
        int i= 0;
        while(true){
            if(i==3){
                i++;
                continue; //3 bad diye bakita print hobe
            }
            System.out.println(i);
            i++;
            if(i>10){
                break;
            }

        }
    }
}
