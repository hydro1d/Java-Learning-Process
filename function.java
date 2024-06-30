import java.util.Scanner;

public class function { // Class name should start with a capital letter

    public static void hammba() {
        System.out.println("hello java programmer");
    }

    public static void add(int a, int b) { // Add takes two integer arguments
        System.out.println("The sum is: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        hammba();
        hammba();
        hammba();
        add(a, b); // Pass a and b as arguments
    }
}
