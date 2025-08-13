import java.util.Scanner;

public class calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        float quotient = num2 != 0 ? num1 / num2 : 0;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

    }
}