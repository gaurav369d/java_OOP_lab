import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        float length = sc.nextFloat();

        System.out.print("Enter the width of the rectangle: ");
        float width = sc.nextFloat();

        float area = length * width;
        float perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
    }
}