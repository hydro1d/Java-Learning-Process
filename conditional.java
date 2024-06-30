
import java.util.Scanner;
public class conditional {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18)
            System.out.println("Choto baccha"); //{} tokhon lagbe jodi 1 tar besi line print korte hoi
        else {
            System.out.println("Boro baccha");
            System.out.println("prem kore biye koro");
        }
        //baki &&(and) ar || (or) eisob too janoi
        // !age = true er mane false."!" er jonno
    }
}
