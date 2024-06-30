
import java.util.Scanner;

public class loop2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int num =0;

        do {
            System.out.println("Enter number");
            num = sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(num);

        }while(num>=0);
        System.out.println("Bye bro!");



    }
}
