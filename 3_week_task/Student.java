import java.util.Scanner;

class Student {
    String name;
    int id;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}
