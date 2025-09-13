// 3. Missing Number in 1..N
class MissingNumber {
    static int findMissing(int[] arr, int n) {
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : arr) actual += num;
        return expected - actual;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println("Missing Number: " + findMissing(arr, 6)); // 3
    }
}
