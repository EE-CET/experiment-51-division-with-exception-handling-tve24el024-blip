import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;   // This may throw ArithmeticException
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        sc.close();
    }
}
