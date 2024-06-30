import java.util.Arrays;
import java.util.Scanner;

public class takinginput {
    public  static  void main(String [] args){

        Scanner sc = new Scanner(System.in); //have to use for taking input

        System.out.println("input you age");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("input you cgpa");
        float cgpa = sc.nextFloat();
        System.out.println(cgpa);

        System.out.println(" your name ?");
        String name = sc.next();
        System.out.println(name);

        System.out.println("tell me about you!");
        String about = sc.nextLine();
        System.out.println(about);
    }
}
