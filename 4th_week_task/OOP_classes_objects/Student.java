// 1. Student Class with Average Grade
class Student {
    String name;
    int roll;
    int[] marks;

    Student(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    String grade() {
        double avg = average();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public String toString() {
        return name + " (Roll: " + roll + ") Avg: " + average() + " Grade: " + grade();
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", 1, new int[]{88, 92, 79});
        System.out.println(s);
    }
}
