class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String n, int a, String s, double sal) {
        super(n, a);
        subject = s;
        salary = sal;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject + ", Salary: " + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Rahul", 35, "Math", 50000);
        t.display();
    }
}

