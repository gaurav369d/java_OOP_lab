// 2. Recursive Fibonacci with Memoization
import java.util.*;

class Fibonacci {
    static Map<Integer, Integer> memo = new HashMap<>();

    static int fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int val = fib(n-1) + fib(n-2);
        memo.put(n, val);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(fib(10)); // 55
    }
}

