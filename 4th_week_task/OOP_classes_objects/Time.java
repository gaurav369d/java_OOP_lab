// 2. Time Class with Add/Subtract
class Time {
    int hours;
    int minutes;

    Time(int h, int m) {
        int total = h * 60 + m;
        this.hours = (total / 60) % 24;
        this.minutes = total % 60;
    }

    Time add(Time other) {
        return new Time(0, this.toMinutes() + other.toMinutes());
    }

    Time subtract(Time other) {
        return new Time(0, this.toMinutes() - other.toMinutes());
    }

    int toMinutes() {
        return hours * 60 + minutes;
    }

    public String toString() {
        return hours + "h " + minutes + "m";
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 75); // 3h 15m
        Time t2 = new Time(1, 45); // 1h 45m
        System.out.println("t1: " + t1);
        System.out.println("t1 + t2: " + t1.add(t2)); // 5h 0m
    }
}
