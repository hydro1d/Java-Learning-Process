
import java.util.Scanner;
public class switchcase {
    public static void main(String [] args){
        System.out.println("Enter day. (ex: 1=Sunday)");
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break; //break na lagle default o print hoye jabe
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Sun to Sat");


        }
    }
}
